/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhz
/*    */ {
/*    */   private final int a;
/*    */   private final float b;
/*    */   private final boolean c;
/*    */   private final boolean d;
/*    */   private final boolean e;
/*    */   private final List<Pair<apu, Float>> f;
/*    */   
/*    */   private bhz(int ☃, float f, boolean bool1, boolean bool2, boolean bool3, List<Pair<apu, Float>> list) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = f;
/* 22 */     this.c = bool1;
/* 23 */     this.d = bool2;
/* 24 */     this.e = bool3;
/* 25 */     this.f = list;
/*    */   }
/*    */   
/*    */   public int a() {
/* 29 */     return this.a;
/*    */   }
/*    */   
/*    */   public float b() {
/* 33 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 37 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 41 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 45 */     return this.e;
/*    */   }
/*    */   
/*    */   public List<Pair<apu, Float>> f() {
/* 49 */     return this.f;
/*    */   }
/*    */   
/*    */   public static class a
/*    */   {
/*    */     private int a;
/*    */     private float b;
/*    */     private boolean c;
/*    */     private boolean d;
/*    */     private boolean e;
/* 59 */     private final List<Pair<apu, Float>> f = Lists.newArrayList();
/*    */     
/*    */     public a a(int ☃) {
/* 62 */       this.a = ☃;
/* 63 */       return this;
/*    */     }
/*    */     
/*    */     public a a(float ☃) {
/* 67 */       this.b = ☃;
/* 68 */       return this;
/*    */     }
/*    */     
/*    */     public a a() {
/* 72 */       this.c = true;
/* 73 */       return this;
/*    */     }
/*    */     
/*    */     public a b() {
/* 77 */       this.d = true;
/* 78 */       return this;
/*    */     }
/*    */     
/*    */     public a c() {
/* 82 */       this.e = true;
/* 83 */       return this;
/*    */     }
/*    */     
/*    */     public a a(apu ☃, float f) {
/* 87 */       this.f.add(Pair.of(☃, Float.valueOf(f)));
/* 88 */       return this;
/*    */     }
/*    */     
/*    */     public bhz d() {
/* 92 */       return new bhz(this.a, this.b, this.c, this.d, this.e, this.f);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */