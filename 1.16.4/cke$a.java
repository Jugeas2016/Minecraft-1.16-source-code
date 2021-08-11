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
/*    */ public class a
/*    */   extends crv<cmh>
/*    */ {
/*    */   public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 53 */     super(☃, i, j, cra1, k, l);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 58 */     cri.q q = new cri.q(this.d, (i << 4) + 2, (j << 4) + 2);
/* 59 */     this.b.add(q);
/* 60 */     q.a(q, this.b, this.d);
/*    */     
/* 62 */     List<cru> list = q.d;
/* 63 */     while (!list.isEmpty()) {
/* 64 */       int k = this.d.nextInt(list.size());
/* 65 */       cru cru = list.remove(k);
/* 66 */       cru.a(q, this.b, this.d);
/*    */     } 
/*    */     
/* 69 */     b();
/* 70 */     a(this.d, 48, 70);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cke$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */