/*    */ import java.util.BitSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ecx
/*    */ {
/*  9 */   private static final int a = (gc.values()).length;
/*    */   
/* 11 */   private final BitSet b = new BitSet(a * a);
/*    */   
/*    */   public void a(Set<gc> ☃) {
/* 14 */     for (gc gc : ☃) {
/* 15 */       for (gc gc1 : ☃) {
/* 16 */         a(gc, gc1, true);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(gc ☃, gc gc1, boolean bool) {
/* 22 */     this.b.set(☃.ordinal() + gc1.ordinal() * a, bool);
/* 23 */     this.b.set(gc1.ordinal() + ☃.ordinal() * a, bool);
/*    */   }
/*    */   
/*    */   public void a(boolean ☃) {
/* 27 */     this.b.set(0, this.b.size(), ☃);
/*    */   }
/*    */   
/*    */   public boolean a(gc ☃, gc gc1) {
/* 31 */     return this.b.get(☃.ordinal() + gc1.ordinal() * a);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 36 */     StringBuilder ☃ = new StringBuilder();
/* 37 */     ☃.append(' ');
/* 38 */     for (gc gc : gc.values()) {
/* 39 */       ☃.append(' ').append(gc.toString().toUpperCase().charAt(0));
/*    */     }
/* 41 */     ☃.append('\n');
/*    */     
/* 43 */     for (gc gc : gc.values()) {
/* 44 */       ☃.append(gc.toString().toUpperCase().charAt(0));
/* 45 */       for (gc gc1 : gc.values()) {
/* 46 */         if (gc == gc1) {
/* 47 */           ☃.append("  ");
/*    */         } else {
/* 49 */           boolean bool = a(gc, gc1);
/* 50 */           ☃.append(' ').append(bool ? 89 : 110);
/*    */         } 
/*    */       } 
/* 53 */       ☃.append('\n');
/*    */     } 
/*    */     
/* 56 */     return ☃.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */