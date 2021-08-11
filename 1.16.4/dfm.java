/*    */ import com.google.common.collect.Queues;
/*    */ import java.util.ArrayDeque;
/*    */ import java.util.Deque;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dfm
/*    */ {
/*    */   private final Deque<a> a;
/*    */   
/*    */   public dfm() {
/* 13 */     this.a = x.<Deque<a>>a(Queues.newArrayDeque(), ☃ -> {
/*    */           b b = new b();
/*    */           b.a();
/*    */           a a = new a();
/*    */           a.c();
/*    */           ☃.add(new a(b, a));
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(double ☃, double d1, double d2) {
/* 24 */     a a = this.a.getLast();
/* 25 */     a.a(a).a(b.b((float)☃, (float)d1, (float)d2));
/*    */   }
/*    */   
/*    */   public void a(float ☃, float f1, float f2) {
/* 29 */     a a = this.a.getLast();
/* 30 */     a.a(a).a(b.a(☃, f1, f2));
/*    */     
/* 32 */     if (☃ == f1 && f1 == f2) {
/*    */       
/* 34 */       if (☃ > 0.0F) {
/*    */         return;
/*    */       }
/* 37 */       a.b(a).a(-1.0F);
/*    */     } 
/*    */ 
/*    */     
/* 41 */     float f3 = 1.0F / ☃;
/* 42 */     float f4 = 1.0F / f1;
/* 43 */     float f5 = 1.0F / f2;
/*    */     
/* 45 */     float f6 = afm.j(f3 * f4 * f5);
/* 46 */     a.b(a).b(a.b(f6 * f3, f6 * f4, f6 * f5));
/*    */   }
/*    */   
/*    */   public void a(d ☃) {
/* 50 */     a a = this.a.getLast();
/* 51 */     a.a(a).a(☃);
/* 52 */     a.b(a).a(☃);
/*    */   }
/*    */   
/*    */   public void a() {
/* 56 */     a ☃ = this.a.getLast();
/* 57 */     this.a.addLast(new a(a.a(☃).d(), a.b(☃).d()));
/*    */   }
/*    */   
/*    */   public void b() {
/* 61 */     this.a.removeLast();
/*    */   }
/*    */   
/*    */   public a c() {
/* 65 */     return this.a.getLast();
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 69 */     return (this.a.size() == 1);
/*    */   }
/*    */   
/*    */   public static final class a {
/*    */     private final b a;
/*    */     private final a b;
/*    */     
/*    */     private a(b ☃, a a1) {
/* 77 */       this.a = ☃;
/* 78 */       this.b = a1;
/*    */     }
/*    */     
/*    */     public b a() {
/* 82 */       return this.a;
/*    */     }
/*    */     
/*    */     public a b() {
/* 86 */       return this.b;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */