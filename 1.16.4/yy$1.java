/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.function.Function;
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
/*    */ final class null
/*    */   implements za.c
/*    */ {
/*    */   null(String paramString) {}
/*    */   
/*    */   public yz a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 32 */     fx fx = ek.a(☃, this.a + "Pos");
/* 33 */     ccj ccj = ((db)☃.getSource()).e().c(fx);
/* 34 */     if (ccj == null) {
/* 35 */       throw yy.c().create();
/*    */     }
/* 37 */     return new yy(ccj, fx);
/*    */   }
/*    */ 
/*    */   
/*    */   public ArgumentBuilder<db, ?> a(ArgumentBuilder ☃, Function function) {
/* 42 */     return ☃.then(dc.a("block").then((ArgumentBuilder)function.apply(dc.a(this.a + "Pos", ek.a()))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yy$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */