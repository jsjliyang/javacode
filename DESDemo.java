// DES加密
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;
import java.security.Security;
import java.util.Base64;

//import org.apache.commons.codec.binary.Base64;
//import org.bouncycastle.jce.provider.BouncyCastleProvider

    public class DESDemo {

        //加密算法
        public static final String KEY_ALGORITHM = "DES";

        public static final String CIPHER_ALGORITHM = "DES/ECB/PKCS5Padding";

        /**
         * 对密钥进行初始化，并返回字节码
         * @return
         * @throws Exception
         */
        public static byte[] initKey() throws Exception{
            KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);
            kg.init(64);	//初始化的密钥的长度
            SecretKey secretKey = kg.generateKey();
            return secretKey.getEncoded();
        }

        public static Key toKey(byte[] key) throws Exception{

            //实例化DES密钥材料
            DESKeySpec dks = new DESKeySpec(key);

            //实例化秘密密钥莞式服务
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(KEY_ALGORITHM);

            //生成秘密密钥
            SecretKey secretKey = keyFactory.generateSecret(dks);

            return secretKey;

        }

        /**
         * 解密
         * @param data
         * @param key
         * @return
         * @throws Exception
         */
        public static byte[] decrypt(byte[] data, byte[] key) throws Exception{
            Key k = toKey(key);		//还原密钥
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE,k);
            return cipher.doFinal(data);
        }

        /**
         * 加密
         * @param data 需要加密的数据
         * @param key 加密密钥
         * @return
         * @throws Exception
         */
        public static byte[] encrypt(byte[] data, byte[] key) throws Exception{
            Key k = toKey(key);		//还原密钥
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);	//实例化
            cipher.init(Cipher.ENCRYPT_MODE, k);	//初始化，设置为解密模式
            return cipher.doFinal(data);	//执行操作
        }

        public static void main(String[] args) throws Exception{
            Security.addProvider(new BouncyCastleProvider());
            String str = "7777";
            String inputStr = str + "  使用DES加密与解密";		//获取字符串
            byte[] inputData = inputStr.getBytes();		//将字符转换成二风景进制
            System.err.println("<----------使用DES加密与解密---------->");
            System.err.println("原文："+ inputStr);	//打印转换后的字节码

            //初始化密钥
            byte[] key = DESDemo.initKey();
            System.err.println("密钥编码前："+key);
            System.err.println("密钥：" + Base64.getEncoder().encodeToString(key));

            //加密
            inputData = DESDemo.encrypt(inputData,key);
            System.err.println("加密后：" + Base64.getEncoder().encodeToString(inputData));

            //解密
            byte[]  outputData = DESDemo.decrypt(inputData, key);
            String outputStr = new String(outputData);
            System.err.println("解密后：" + outputStr);

            System.err.println("<----------DES加密与解密完成---------->");
        }
    }
