/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */   implements brt.c
/*    */ {
/*    */   null(LiteralArgumentBuilder paramLiteralArgumentBuilder) {}
/*    */   
/*    */   public <T extends brt.g<T>> void a(brt.e<T> ☃, brt.f<T> f1) {
/* 20 */     this.a.then((
/* 21 */         (LiteralArgumentBuilder)dc.a(☃.a())
/* 22 */         .executes(commandContext -> xd.a((db)commandContext.getSource(), ☃)))
/* 23 */         .then(f1
/* 24 */           .a("value")
/* 25 */           .executes(commandContext -> xd.a(commandContext, ☃))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xd$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */