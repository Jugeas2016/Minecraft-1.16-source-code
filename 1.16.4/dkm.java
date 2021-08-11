/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.util.UUIDTypeAdapter;
/*    */ import java.util.Arrays;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dkm
/*    */ {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   private final a d;
/*    */   
/*    */   public dkm(String ☃, String str1, String str2, String str3) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = str1;
/* 23 */     this.c = str2;
/* 24 */     this.d = a.a(str3);
/*    */   }
/*    */   
/*    */   public String a() {
/* 28 */     return "token:" + this.c + ":" + this.b;
/*    */   }
/*    */   
/*    */   public String b() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public String c() {
/* 36 */     return this.a;
/*    */   }
/*    */   
/*    */   public String d() {
/* 40 */     return this.c;
/*    */   }
/*    */   
/*    */   public GameProfile e() {
/*    */     try {
/* 45 */       UUID ☃ = UUIDTypeAdapter.fromString(b());
/* 46 */       return new GameProfile(☃, c());
/* 47 */     } catch (IllegalArgumentException ☃) {
/* 48 */       return new GameProfile(null, c());
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public enum a
/*    */   {
/* 57 */     a("legacy"),
/* 58 */     b("mojang"); private static final Map<String, a> c;
/*    */     static {
/* 60 */       c = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> ☃.d, Function.identity()));
/*    */     }
/*    */     private final String d;
/*    */     
/*    */     a(String ☃) {
/* 65 */       this.d = ☃;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public static a a(String ☃) {
/* 70 */       return c.get(☃.toLowerCase(Locale.ROOT));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */