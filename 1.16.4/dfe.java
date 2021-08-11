/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Map;
/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dfe
/*    */ {
/*    */   private final a a;
/*    */   private final String b;
/*    */   private final int c;
/*    */   private int d;
/*    */   
/*    */   private dfe(a ☃, int i, String str) {
/* 25 */     this.a = ☃;
/* 26 */     this.c = i;
/* 27 */     this.b = str;
/*    */   }
/*    */   
/*    */   public void a(dfd ☃) {
/* 31 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 32 */     this.d++;
/* 33 */     dem.d(☃.a(), this.c);
/*    */   }
/*    */   
/*    */   public void a() {
/* 37 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 38 */     this.d--;
/*    */     
/* 40 */     if (this.d <= 0) {
/* 41 */       dem.d(this.c);
/* 42 */       this.a.c().remove(this.b);
/*    */     } 
/*    */   }
/*    */   
/*    */   public String b() {
/* 47 */     return this.b;
/*    */   }
/*    */   
/*    */   public static dfe a(a ☃, String str1, InputStream inputStream, String str2) throws IOException {
/* 51 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 52 */     String str = dex.b(inputStream);
/* 53 */     if (str == null) {
/* 54 */       throw new IOException("Could not load program " + ☃.a());
/*    */     }
/* 56 */     int i = dem.e(a.a(☃));
/* 57 */     dem.a(i, str);
/* 58 */     dem.f(i);
/*    */     
/* 60 */     if (dem.e(i, 35713) == 0) {
/* 61 */       String str3 = StringUtils.trim(dem.i(i, 32768));
/* 62 */       throw new IOException("Couldn't compile " + ☃.a() + " program (" + str2 + ", " + str1 + ") : " + str3);
/*    */     } 
/*    */     
/* 65 */     dfe dfe1 = new dfe(☃, i, str1);
/* 66 */     ☃.c().put(str1, dfe1);
/* 67 */     return dfe1;
/*    */   }
/*    */   
/*    */   public enum a {
/* 71 */     a("vertex", ".vsh", 35633),
/* 72 */     b("fragment", ".fsh", 35632);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 77 */     private final Map<String, dfe> f = Maps.newHashMap(); private final String c;
/*    */     
/*    */     a(String ☃, String str1, int i) {
/* 80 */       this.c = ☃;
/* 81 */       this.d = str1;
/* 82 */       this.e = i;
/*    */     }
/*    */     private final String d; private final int e;
/*    */     public String a() {
/* 86 */       return this.c;
/*    */     }
/*    */     
/*    */     public String b() {
/* 90 */       return this.d;
/*    */     }
/*    */     
/*    */     private int d() {
/* 94 */       return this.e;
/*    */     }
/*    */     
/*    */     public Map<String, dfe> c() {
/* 98 */       return this.f;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */