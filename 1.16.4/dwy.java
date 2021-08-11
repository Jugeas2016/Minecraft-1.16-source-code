/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.net.IDN;
/*     */ import java.util.Hashtable;
/*     */ import javax.naming.directory.Attribute;
/*     */ import javax.naming.directory.Attributes;
/*     */ import javax.naming.directory.DirContext;
/*     */ import javax.naming.directory.InitialDirContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dwy
/*     */ {
/*     */   private final String a;
/*     */   private final int b;
/*     */   
/*     */   private dwy(String ☃, int i) {
/*  18 */     this.a = ☃;
/*  19 */     this.b = i;
/*     */   }
/*     */   
/*     */   public String a() {
/*     */     try {
/*  24 */       return IDN.toASCII(this.a);
/*  25 */     } catch (IllegalArgumentException ☃) {
/*  26 */       return "";
/*     */     } 
/*     */   }
/*     */   
/*     */   public int b() {
/*  31 */     return this.b;
/*     */   }
/*     */   
/*     */   public static dwy a(String ☃) {
/*  35 */     if (☃ == null) {
/*  36 */       return null;
/*     */     }
/*     */     
/*  39 */     String[] arrayOfString = ☃.split(":");
/*     */     
/*  41 */     if (☃.startsWith("[")) {
/*  42 */       int j = ☃.indexOf("]");
/*  43 */       if (j > 0) {
/*  44 */         String str1 = ☃.substring(1, j);
/*  45 */         String str2 = ☃.substring(j + 1).trim();
/*  46 */         if (str2.startsWith(":") && !str2.isEmpty()) {
/*  47 */           str2 = str2.substring(1);
/*  48 */           arrayOfString = new String[2];
/*  49 */           arrayOfString[0] = str1;
/*  50 */           arrayOfString[1] = str2;
/*     */         } else {
/*  52 */           arrayOfString = new String[1];
/*  53 */           arrayOfString[0] = str1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  58 */     if (arrayOfString.length > 2) {
/*  59 */       arrayOfString = new String[1];
/*  60 */       arrayOfString[0] = ☃;
/*     */     } 
/*     */     
/*  63 */     String str = arrayOfString[0];
/*  64 */     int i = (arrayOfString.length > 1) ? a(arrayOfString[1], 25565) : 25565;
/*     */     
/*  66 */     if (i == 25565) {
/*  67 */       Pair<String, Integer> pair = b(str);
/*  68 */       str = (String)pair.getFirst();
/*  69 */       i = ((Integer)pair.getSecond()).intValue();
/*     */     } 
/*     */     
/*  72 */     return new dwy(str, i);
/*     */   }
/*     */   
/*     */   private static Pair<String, Integer> b(String ☃) {
/*     */     try {
/*  77 */       String str = "com.sun.jndi.dns.DnsContextFactory";
/*     */       
/*  79 */       Class.forName("com.sun.jndi.dns.DnsContextFactory");
/*     */       
/*  81 */       Hashtable<String, String> hashtable = new Hashtable<>();
/*  82 */       hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
/*  83 */       hashtable.put("java.naming.provider.url", "dns:");
/*  84 */       hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
/*  85 */       DirContext dirContext = new InitialDirContext(hashtable);
/*  86 */       Attributes attributes = dirContext.getAttributes("_minecraft._tcp." + ☃, new String[] { "SRV" });
/*  87 */       Attribute attribute = attributes.get("srv");
/*  88 */       if (attribute != null) {
/*  89 */         String[] arrayOfString = attribute.get().toString().split(" ", 4);
/*  90 */         return Pair.of(arrayOfString[3], Integer.valueOf(a(arrayOfString[2], 25565)));
/*     */       } 
/*  92 */     } catch (Throwable throwable) {}
/*     */     
/*  94 */     return Pair.of(☃, Integer.valueOf(25565));
/*     */   }
/*     */   
/*     */   private static int a(String ☃, int i) {
/*     */     try {
/*  99 */       return Integer.parseInt(☃.trim());
/* 100 */     } catch (Exception exception) {
/*     */ 
/*     */       
/* 103 */       return i;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */