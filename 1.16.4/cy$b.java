/*    */ import com.mojang.brigadier.ParseResults;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.ArrayDeque;
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
/*    */ public class b
/*    */   implements cy.c
/*    */ {
/*    */   private final ParseResults<db> a;
/*    */   
/*    */   public b(ParseResults<db> ☃) {
/* 77 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(vx ☃, db db1, ArrayDeque<vx.a> arrayDeque, int i) throws CommandSyntaxException {
/* 82 */     ☃.c().execute(new ParseResults(this.a.getContext().withSource(db1), this.a.getReader(), this.a.getExceptions()));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 87 */     return this.a.getReader().getString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cy$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */