/*    */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*    */ import it.unimi.dsi.fastutil.ints.IntList;
/*    */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vb<C extends aon>
/*    */   extends va<C>
/*    */ {
/*    */   private boolean e;
/*    */   
/*    */   public vb(bjj<C> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(boq<C> ☃, boolean bool) {
/* 24 */     this.e = this.d.a(☃);
/* 25 */     int i = this.b.b(☃, (IntList)null);
/*    */ 
/*    */     
/* 28 */     if (this.e) {
/* 29 */       bmb bmb = this.d.a(0).e();
/* 30 */       if (bmb.a() || i <= bmb.E()) {
/*    */         return;
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 36 */     int j = a(bool, i, this.e);
/*    */ 
/*    */     
/* 39 */     IntArrayList intArrayList = new IntArrayList();
/* 40 */     if (!this.b.a(☃, (IntList)intArrayList, j)) {
/*    */       return;
/*    */     }
/*    */     
/* 44 */     if (!this.e) {
/* 45 */       a(this.d.f());
/* 46 */       a(0);
/*    */     } 
/* 48 */     a(j, (IntList)intArrayList);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a() {
/* 53 */     a(this.d.f());
/* 54 */     super.a();
/*    */   }
/*    */   
/*    */   protected void a(int ☃, IntList intList) {
/* 58 */     IntListIterator<Integer> intListIterator = intList.iterator();
/*    */     
/* 60 */     bjr bjr = this.d.a(0);
/* 61 */     bmb bmb = bfy.a(((Integer)intListIterator.next()).intValue());
/* 62 */     if (bmb.a()) {
/*    */       return;
/*    */     }
/*    */     
/* 66 */     int i = Math.min(bmb.c(), ☃);
/* 67 */     if (this.e) {
/* 68 */       i -= bjr.e().E();
/*    */     }
/* 70 */     for (int j = 0; j < i; j++)
/* 71 */       a(bjr, bmb); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */