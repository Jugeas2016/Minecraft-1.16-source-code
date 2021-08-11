/*    */ import com.google.common.collect.ForwardingList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzo
/*    */   extends ForwardingList<bmb>
/*    */ {
/* 13 */   private final gj<bmb> a = gj.a(bfv.g(), bmb.b);
/*    */ 
/*    */   
/*    */   protected List<bmb> delegate() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public mj a() {
/* 21 */     mj ☃ = new mj();
/* 22 */     for (bmb bmb : delegate()) {
/* 23 */       ☃.add(bmb.b(new md()));
/*    */     }
/* 25 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a(mj ☃) {
/* 29 */     List<bmb> list = delegate();
/* 30 */     for (int i = 0; i < list.size(); i++) {
/* 31 */       list.set(i, bmb.a(☃.a(i)));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isEmpty() {
/* 37 */     for (bmb ☃ : delegate()) {
/* 38 */       if (!☃.a()) {
/* 39 */         return false;
/*    */       }
/*    */     } 
/* 42 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */