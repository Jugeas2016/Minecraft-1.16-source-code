/*    */ import com.google.common.base.MoreObjects;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dsu
/*    */ {
/*    */   private final dsr a;
/*    */   private final List<dss> b;
/*    */   private final int c;
/*    */   
/*    */   public dsu(dsr ☃, List<dss> list, int i) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = list;
/* 20 */     this.c = i;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dss a(int ☃) {
/* 28 */     if (☃ < 0 || ☃ >= this.b.size()) {
/* 29 */       return dsq.a;
/*    */     }
/*    */     
/* 32 */     return (dss)MoreObjects.firstNonNull(this.b.get(☃), dsq.a);
/*    */   }
/*    */   
/*    */   public int b() {
/* 36 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */