/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum f
/*     */   implements afs
/*     */ {
/* 169 */   a("none")
/*     */   {
/*     */     public float a(fx ☃, float f1) {
/* 172 */       return f1;
/*     */     }
/*     */   },
/* 175 */   b("frozen")
/*     */   {
/*     */     public float a(fx ☃, float f1) {
/* 178 */       double d1 = bsv.u().a(☃.u() * 0.05D, ☃.w() * 0.05D, false) * 7.0D;
/* 179 */       double d2 = bsv.f.a(☃.u() * 0.2D, ☃.w() * 0.2D, false);
/* 180 */       double d3 = d1 + d2;
/* 181 */       if (d3 < 0.3D) {
/* 182 */         double d = bsv.f.a(☃.u() * 0.09D, ☃.w() * 0.09D, false);
/* 183 */         if (d < 0.8D) {
/* 184 */           return 0.2F;
/*     */         }
/*     */       } 
/*     */       
/* 188 */       return f1;
/*     */     }
/*     */   };
/*     */   
/*     */   private final String d;
/*     */   public static final Codec<f> c;
/*     */   private static final Map<String, f> e;
/*     */   
/*     */   f(String ☃) {
/* 197 */     this.d = ☃;
/*     */   }
/*     */   static {
/* 200 */     c = afs.a(f::values, f::a);
/*     */     
/* 202 */     e = (Map<String, f>)Arrays.<f>stream(values()).collect(Collectors.toMap(f::b, ☃ -> ☃));
/*     */   }
/*     */   public String b() {
/* 205 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 210 */     return this.d;
/*     */   }
/*     */   
/*     */   public static f a(String ☃) {
/* 214 */     return e.get(☃);
/*     */   }
/*     */   
/*     */   public abstract float a(fx paramfx, float paramFloat);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsv$f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */