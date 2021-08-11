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
/*    */ 
/*    */ 
/*    */ public class bmv
/*    */   extends blx
/*    */ {
/*    */   public bmv(blx.a ☃) {
/* 22 */     super(☃);
/*    */     
/* 24 */     bwa.a(this, bjy.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public String f(bmb ☃) {
/* 29 */     if (☃.b("BlockEntityTag") != null) {
/* 30 */       return a() + '.' + d(☃).c();
/*    */     }
/* 32 */     return super.f(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 37 */     bke.a(☃, list);
/*    */   }
/*    */ 
/*    */   
/*    */   public bnn d_(bmb ☃) {
/* 42 */     return bnn.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public int e_(bmb ☃) {
/* 47 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 52 */     bmb bmb = bfw1.b(aot1);
/* 53 */     bfw1.c(aot1);
/* 54 */     return aov.b(bmb);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃, bmb bmb1) {
/* 59 */     return (aeg.c.a(bmb1.b()) || super.a(☃, bmb1));
/*    */   }
/*    */   
/*    */   public static bkx d(bmb ☃) {
/* 63 */     return bkx.a(☃.a("BlockEntityTag").h("Base"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */