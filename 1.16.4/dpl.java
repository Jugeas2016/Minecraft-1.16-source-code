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
/*    */ public class dpl
/*    */   extends dol
/*    */ {
/*    */   public djw c;
/*    */   public long p;
/*    */   private dpk q;
/*    */   private dlj r;
/*    */   
/*    */   public dpl(dot ☃, dkd dkd1) {
/* 23 */     super(☃, dkd1, new of("controls.title"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 28 */     a(new dlj(this.k / 2 - 155, 18, 150, 20, new of("options.mouse_settings"), ☃ -> this.i.a(new doj(this, this.b))));
/* 29 */     a(dkc.E.a(this.b, this.k / 2 - 155 + 160, 18, 150));
/*    */     
/* 31 */     this.q = new dpk(this, this.i);
/* 32 */     this.e.add(this.q);
/*    */     
/* 34 */     this.r = a(new dlj(this.k / 2 - 155, this.l - 29, 150, 20, new of("controls.resetAll"), ☃ -> {
/*    */             for (djw djw1 : this.b.aF) {
/*    */               djw1.b(djw1.h());
/*    */             }
/*    */             djw.c();
/*    */           }));
/* 40 */     a(new dlj(this.k / 2 - 155 + 160, this.l - 29, 150, 20, nq.c, ☃ -> this.i.a(this.a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(double ☃, double d1, int i) {
/* 45 */     if (this.c != null) {
/* 46 */       this.b.a(this.c, deo.b.c.a(i));
/* 47 */       this.c = null;
/* 48 */       djw.c();
/* 49 */       return true;
/*    */     } 
/* 51 */     return super.a(☃, d1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i, int j) {
/* 56 */     if (this.c != null) {
/* 57 */       if (☃ == 256) {
/* 58 */         this.b.a(this.c, deo.a);
/*    */       } else {
/* 60 */         this.b.a(this.c, deo.a(☃, i));
/*    */       } 
/*    */       
/* 63 */       this.c = null;
/* 64 */       this.p = x.b();
/* 65 */       djw.c();
/* 66 */       return true;
/*    */     } 
/* 68 */     return super.a(☃, i, j);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 74 */     a(☃);
/*    */     
/* 76 */     this.q.a(☃, i, j, f);
/* 77 */     a(☃, this.o, this.d, this.k / 2, 8, 16777215);
/*    */     
/* 79 */     boolean bool = false;
/* 80 */     for (djw djw1 : this.b.aF) {
/* 81 */       if (!djw1.k()) {
/* 82 */         bool = true;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 87 */     this.r.o = bool;
/*    */     
/* 89 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */