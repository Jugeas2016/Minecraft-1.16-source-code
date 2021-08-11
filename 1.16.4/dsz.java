/*    */ import com.mojang.authlib.properties.PropertyMap;
/*    */ import java.io.File;
/*    */ import java.net.Proxy;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dsz
/*    */ {
/*    */   public final d a;
/*    */   public final dej b;
/*    */   public final a c;
/*    */   public final b d;
/*    */   public final c e;
/*    */   
/*    */   public dsz(d ☃, dej dej1, a a1, b b1, c c1) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = dej1;
/* 23 */     this.c = a1;
/* 24 */     this.d = b1;
/* 25 */     this.e = c1;
/*    */   }
/*    */   
/*    */   public static class b {
/*    */     public final boolean a;
/*    */     public final String b;
/*    */     public final String c;
/*    */     public final boolean d;
/*    */     public final boolean e;
/*    */     
/*    */     public b(boolean ☃, String str1, String str2, boolean bool1, boolean bool2) {
/* 36 */       this.a = ☃;
/* 37 */       this.b = str1;
/* 38 */       this.c = str2;
/* 39 */       this.d = bool1;
/* 40 */       this.e = bool2;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class d {
/*    */     public final dkm a;
/*    */     public final PropertyMap b;
/*    */     public final PropertyMap c;
/*    */     public final Proxy d;
/*    */     
/*    */     public d(dkm ☃, PropertyMap propertyMap1, PropertyMap propertyMap2, Proxy proxy) {
/* 51 */       this.a = ☃;
/* 52 */       this.b = propertyMap1;
/* 53 */       this.c = propertyMap2;
/* 54 */       this.d = proxy;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     public final File a;
/*    */     public final File b;
/*    */     public final File c;
/*    */     @Nullable
/*    */     public final String d;
/*    */     
/*    */     public a(File ☃, File file1, File file2, @Nullable String str) {
/* 66 */       this.a = ☃;
/* 67 */       this.b = file1;
/* 68 */       this.c = file2;
/* 69 */       this.d = str;
/*    */     }
/*    */     
/*    */     public ekg a() {
/* 73 */       return (this.d == null) ? new ekk(this.c) : new ekg(this.c, this.d);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class c {
/*    */     @Nullable
/*    */     public final String a;
/*    */     public final int b;
/*    */     
/*    */     public c(@Nullable String ☃, int i) {
/* 83 */       this.a = ☃;
/* 84 */       this.b = i;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */