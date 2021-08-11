/*     */ import java.util.ArrayDeque;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   implements cy.c
/*     */ {
/*     */   private final cy.a a;
/*     */   
/*     */   public d(cy ☃) {
/*  95 */     this.a = new cy.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(vx ☃, db db1, ArrayDeque<vx.a> arrayDeque, int i) {
/* 100 */     this.a.a(☃).ifPresent(cy1 -> {
/*     */           cy.c[] arrayOfC = cy1.b();
/*     */           int i = ☃ - arrayDeque.size();
/*     */           int j = Math.min(arrayOfC.length, i);
/*     */           for (int k = j - 1; k >= 0; k--) {
/*     */             arrayDeque.addFirst(new vx.a(vx1, db1, arrayOfC[k]));
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 112 */     return "function " + this.a.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cy$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */