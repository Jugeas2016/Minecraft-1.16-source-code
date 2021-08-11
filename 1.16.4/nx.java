/*    */ import java.util.function.UnaryOperator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface nx
/*    */   extends nr
/*    */ {
/*    */   nx a(ob paramob);
/*    */   
/*    */   default nx c(String ☃) {
/* 12 */     return a(new oe(☃));
/*    */   }
/*    */   
/*    */   nx a(nr paramnr);
/*    */   
/*    */   default nx a(UnaryOperator<ob> ☃) {
/* 18 */     a(☃.apply(c()));
/* 19 */     return this;
/*    */   }
/*    */   
/*    */   default nx c(ob ☃) {
/* 23 */     a(☃.a(c()));
/* 24 */     return this;
/*    */   }
/*    */   
/*    */   nx a(k... ☃) {
/* 28 */     a(c().a(☃));
/* 29 */     return this;
/*    */   }
/*    */   
/*    */   default nx a(k ☃) {
/* 33 */     a(c().b(☃));
/* 34 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */