/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjs
/*    */   extends bja
/*    */ {
/*    */   private final brx g;
/*    */   @Nullable
/*    */   private bph h;
/*    */   private final List<bph> i;
/*    */   
/*    */   public bjs(int ☃, bfv bfv1) {
/* 25 */     this(☃, bfv1, bim.a);
/*    */   }
/*    */   
/*    */   public bjs(int ☃, bfv bfv1, bim bim1) {
/* 29 */     super(bje.u, ☃, bfv1, bim1);
/* 30 */     this.g = bfv1.e.l;
/* 31 */     this.i = this.g.o().a(bot.g);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(ceh ☃) {
/* 36 */     return ☃.a(bup.lZ);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(bfw ☃, boolean bool) {
/* 41 */     return (this.h != null && this.h.a(this.d, this.g));
/*    */   }
/*    */ 
/*    */   
/*    */   protected bmb a(bfw ☃, bmb bmb1) {
/* 46 */     bmb1.a(☃.l, ☃, bmb1.E());
/* 47 */     this.c.b(☃);
/*    */ 
/*    */     
/* 50 */     d(0);
/* 51 */     d(1);
/*    */     
/* 53 */     this.e.a((☃, fx1) -> ☃.c(1044, fx1, 0));
/* 54 */     return bmb1;
/*    */   }
/*    */   
/*    */   private void d(int ☃) {
/* 58 */     bmb bmb = this.d.a(☃);
/* 59 */     bmb.g(1);
/* 60 */     this.d.a(☃, bmb);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 65 */     List<bph> ☃ = this.g.o().b(bot.g, this.d, this.g);
/* 66 */     if (☃.isEmpty()) {
/* 67 */       this.c.a(0, bmb.b);
/*    */     } else {
/* 69 */       this.h = ☃.get(0);
/* 70 */       bmb bmb = this.h.a(this.d);
/* 71 */       this.c.a(this.h);
/* 72 */       this.c.a(0, bmb);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(bmb ☃) {
/* 78 */     return this.i.stream().anyMatch(bph1 -> bph1.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃, bjr bjr1) {
/* 83 */     return (bjr1.c != this.c && super.a(☃, bjr1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */