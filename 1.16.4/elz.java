/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class elz
/*    */   implements elo
/*    */ {
/*    */   private final int a;
/*    */   private final List<b> b;
/*    */   private final elo c;
/*    */   
/*    */   public elz(List<b> ☃) {
/* 22 */     this.b = ☃;
/* 23 */     this.a = afz.a((List)☃);
/* 24 */     this.c = ((b)☃.get(0)).b;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<eba> a(@Nullable ceh ☃, @Nullable gc gc1, Random random) {
/* 29 */     return ((b)afz.a((List)this.b, Math.abs((int)random.nextLong()) % this.a)).b.a(☃, gc1, random);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 34 */     return this.c.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 39 */     return this.c.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean c() {
/* 44 */     return this.c.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean d() {
/* 49 */     return this.c.d();
/*    */   }
/*    */ 
/*    */   
/*    */   public ekc e() {
/* 54 */     return this.c.e();
/*    */   }
/*    */ 
/*    */   
/*    */   public ebm f() {
/* 59 */     return this.c.f();
/*    */   }
/*    */ 
/*    */   
/*    */   public ebk g() {
/* 64 */     return this.c.g();
/*    */   }
/*    */   
/*    */   public static class a {
/* 68 */     private final List<elz.b> a = Lists.newArrayList();
/*    */     
/*    */     public a a(@Nullable elo ☃, int i) {
/* 71 */       if (☃ != null) {
/* 72 */         this.a.add(new elz.b(☃, i));
/*    */       }
/* 74 */       return this;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public elo a() {
/* 79 */       if (this.a.isEmpty()) {
/* 80 */         return null;
/*    */       }
/* 82 */       if (this.a.size() == 1) {
/* 83 */         return ((elz.b)this.a.get(0)).b;
/*    */       }
/* 85 */       return new elz(this.a);
/*    */     }
/*    */   }
/*    */   
/*    */   static class b extends afz.a {
/*    */     protected final elo b;
/*    */     
/*    */     public b(elo ☃, int i) {
/* 93 */       super(i);
/* 94 */       this.b = ☃;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */