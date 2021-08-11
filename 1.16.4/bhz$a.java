/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   private int a;
/*    */   private float b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   private boolean e;
/* 59 */   private final List<Pair<apu, Float>> f = Lists.newArrayList();
/*    */   
/*    */   public a a(int ☃) {
/* 62 */     this.a = ☃;
/* 63 */     return this;
/*    */   }
/*    */   
/*    */   public a a(float ☃) {
/* 67 */     this.b = ☃;
/* 68 */     return this;
/*    */   }
/*    */   
/*    */   public a a() {
/* 72 */     this.c = true;
/* 73 */     return this;
/*    */   }
/*    */   
/*    */   public a b() {
/* 77 */     this.d = true;
/* 78 */     return this;
/*    */   }
/*    */   
/*    */   public a c() {
/* 82 */     this.e = true;
/* 83 */     return this;
/*    */   }
/*    */   
/*    */   public a a(apu ☃, float f) {
/* 87 */     this.f.add(Pair.of(☃, Float.valueOf(f)));
/* 88 */     return this;
/*    */   }
/*    */   
/*    */   public bhz d() {
/* 92 */     return new bhz(this.a, this.b, this.c, this.d, this.e, this.f, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */