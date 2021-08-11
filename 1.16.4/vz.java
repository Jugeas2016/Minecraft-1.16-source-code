/*    */ import java.util.List;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
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
/*    */ public class vz
/*    */   implements AutoCloseable
/*    */ {
/* 21 */   private static final CompletableFuture<afx> a = CompletableFuture.completedFuture(afx.a);
/*    */   
/* 23 */   private final acf b = new acm(abk.b);
/*    */   
/*    */   private final dc c;
/* 26 */   private final bor d = new bor();
/* 27 */   private final aep e = new aep();
/* 28 */   private final cza f = new cza();
/* 29 */   private final cyz g = new cyz(this.f);
/* 30 */   private final vv h = new vv(this.f);
/*    */   private final vw i;
/*    */   
/*    */   public vz(dc.a ☃, int i) {
/* 34 */     this.c = new dc(☃);
/* 35 */     this.i = new vw(i, this.c.a());
/*    */     
/* 37 */     this.b.a(this.e);
/* 38 */     this.b.a(this.f);
/* 39 */     this.b.a(this.d);
/* 40 */     this.b.a(this.g);
/* 41 */     this.b.a(this.i);
/* 42 */     this.b.a(this.h);
/*    */   }
/*    */   
/*    */   public vw a() {
/* 46 */     return this.i;
/*    */   }
/*    */   
/*    */   public cza b() {
/* 50 */     return this.f;
/*    */   }
/*    */   
/*    */   public cyz c() {
/* 54 */     return this.g;
/*    */   }
/*    */   
/*    */   public aen d() {
/* 58 */     return this.e.a();
/*    */   }
/*    */   
/*    */   public bor e() {
/* 62 */     return this.d;
/*    */   }
/*    */   
/*    */   public dc f() {
/* 66 */     return this.c;
/*    */   }
/*    */   
/*    */   public vv g() {
/* 70 */     return this.h;
/*    */   }
/*    */   
/*    */   public ach h() {
/* 74 */     return this.b;
/*    */   }
/*    */   
/*    */   public static CompletableFuture<vz> a(List<abj> ☃, dc.a a1, int i, Executor executor1, Executor executor2) {
/* 78 */     vz vz1 = new vz(a1, i);
/* 79 */     CompletableFuture<afx> completableFuture = vz1.b.a(executor1, executor2, ☃, a);
/* 80 */     return completableFuture.whenComplete((afx1, throwable) -> {
/*    */           if (throwable != null) {
/*    */             ☃.close();
/*    */           }
/* 84 */         }).thenApply(afx1 -> ☃);
/*    */   }
/*    */   
/*    */   public void i() {
/* 88 */     this.e.a().e();
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 93 */     this.b.close();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */