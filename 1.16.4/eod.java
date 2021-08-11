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
/*    */ public class eod
/*    */   implements eof
/*    */ {
/* 19 */   private static final nr a = new of("tutorial.punch_tree.title");
/* 20 */   private static final nr b = new of("tutorial.punch_tree.description", new Object[] { eoe.a("attack") });
/*    */   
/*    */   private final eoe c;
/*    */   private dms d;
/*    */   private int e;
/*    */   private int f;
/*    */   
/*    */   public eod(eoe ☃) {
/* 28 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 33 */     this.e++;
/*    */     
/* 35 */     if (this.c.f() != bru.b) {
/* 36 */       this.c.a(eog.f);
/*    */       
/*    */       return;
/*    */     } 
/* 40 */     if (this.e == 1) {
/* 41 */       dzm ☃ = (this.c.e()).s;
/* 42 */       if (☃ != null) {
/* 43 */         if (☃.bm.a(aeg.q)) {
/* 44 */           this.c.a(eog.e);
/*    */           return;
/*    */         } 
/* 47 */         if (eoa.a(☃)) {
/* 48 */           this.c.a(eog.e);
/*    */           
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } 
/* 54 */     if ((this.e >= 600 || this.f > 3) && 
/* 55 */       this.d == null) {
/* 56 */       this.d = new dms(dms.a.c, a, b, true);
/* 57 */       this.c.e().an().a(this.d);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b() {
/* 64 */     if (this.d != null) {
/* 65 */       this.d.b();
/* 66 */       this.d = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dwt ☃, fx fx1, ceh ceh1, float f) {
/* 72 */     boolean bool = ceh1.a(aed.s);
/* 73 */     if (bool && f > 0.0F) {
/* 74 */       if (this.d != null) {
/* 75 */         this.d.a(f);
/*    */       }
/* 77 */       if (f >= 1.0F) {
/* 78 */         this.c.a(eog.d);
/*    */       }
/* 80 */     } else if (this.d != null) {
/* 81 */       this.d.a(0.0F);
/* 82 */     } else if (bool) {
/* 83 */       this.f++;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃) {
/* 89 */     if (aeg.q.a(☃.b())) {
/* 90 */       this.c.a(eog.e);
/*    */       return;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */