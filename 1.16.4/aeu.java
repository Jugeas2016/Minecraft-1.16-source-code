/*     */ import java.security.Key;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPair;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.PrivateKey;
/*     */ import java.security.PublicKey;
/*     */ import java.security.spec.EncodedKeySpec;
/*     */ import java.security.spec.X509EncodedKeySpec;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.KeyGenerator;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aeu
/*     */ {
/*     */   public static SecretKey a() throws aev {
/*     */     try {
/*  28 */       KeyGenerator ☃ = KeyGenerator.getInstance("AES");
/*  29 */       ☃.init(128);
/*  30 */       return ☃.generateKey();
/*  31 */     } catch (Exception ☃) {
/*  32 */       throw new aev(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static KeyPair b() throws aev {
/*     */     try {
/*  38 */       KeyPairGenerator ☃ = KeyPairGenerator.getInstance("RSA");
/*  39 */       ☃.initialize(1024);
/*     */       
/*  41 */       return ☃.generateKeyPair();
/*  42 */     } catch (Exception ☃) {
/*  43 */       throw new aev(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static byte[] a(String ☃, PublicKey publicKey, SecretKey secretKey) throws aev {
/*     */     try {
/*  49 */       return a(new byte[][] { ☃
/*  50 */             .getBytes("ISO_8859_1"), secretKey
/*  51 */             .getEncoded(), publicKey
/*  52 */             .getEncoded() });
/*     */     }
/*  54 */     catch (Exception exception) {
/*  55 */       throw new aev(exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static byte[] a(byte[]... ☃) throws Exception {
/*  60 */     MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
/*  61 */     for (byte[] arrayOfByte : ☃) {
/*  62 */       messageDigest.update(arrayOfByte);
/*     */     }
/*  64 */     return messageDigest.digest();
/*     */   }
/*     */   
/*     */   public static PublicKey a(byte[] ☃) throws aev {
/*     */     try {
/*  69 */       EncodedKeySpec encodedKeySpec = new X509EncodedKeySpec(☃);
/*  70 */       KeyFactory keyFactory = KeyFactory.getInstance("RSA");
/*  71 */       return keyFactory.generatePublic(encodedKeySpec);
/*  72 */     } catch (Exception exception) {
/*  73 */       throw new aev(exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static SecretKey a(PrivateKey ☃, byte[] arrayOfByte) throws aev {
/*  78 */     byte[] arrayOfByte1 = b(☃, arrayOfByte);
/*     */     try {
/*  80 */       return new SecretKeySpec(arrayOfByte1, "AES");
/*  81 */     } catch (Exception exception) {
/*  82 */       throw new aev(exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static byte[] a(Key ☃, byte[] arrayOfByte) throws aev {
/*  87 */     return a(1, ☃, arrayOfByte);
/*     */   }
/*     */   
/*     */   public static byte[] b(Key ☃, byte[] arrayOfByte) throws aev {
/*  91 */     return a(2, ☃, arrayOfByte);
/*     */   }
/*     */   
/*     */   private static byte[] a(int ☃, Key key, byte[] arrayOfByte) throws aev {
/*     */     try {
/*  96 */       return a(☃, key.getAlgorithm(), key).doFinal(arrayOfByte);
/*  97 */     } catch (Exception exception) {
/*  98 */       throw new aev(exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Cipher a(int ☃, String str, Key key) throws Exception {
/* 103 */     Cipher cipher = Cipher.getInstance(str);
/* 104 */     cipher.init(☃, key);
/* 105 */     return cipher;
/*     */   }
/*     */   
/*     */   public static Cipher a(int ☃, Key key) throws aev {
/*     */     try {
/* 110 */       Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
/* 111 */       cipher.init(☃, key, new IvParameterSpec(key.getEncoded()));
/* 112 */       return cipher;
/* 113 */     } catch (Exception exception) {
/* 114 */       throw new aev(exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aeu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */