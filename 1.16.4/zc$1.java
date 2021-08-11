/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
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
/*    */ final class null
/*    */   implements za.c
/*    */ {
/*    */   null(String paramString) {}
/*    */   
/*    */   public yz a(CommandContext<db> ☃) {
/* 31 */     return new zc(zc.a(☃), dy.e(☃, this.a), null);
/*    */   }
/*    */ 
/*    */   
/*    */   public ArgumentBuilder<db, ?> a(ArgumentBuilder ☃, Function<RequiredArgumentBuilder, ArgumentBuilder> function) {
/* 36 */     return ☃.then(dc.a("storage").then(function.apply(dc.<T>a(this.a, dy.a()).suggests(zc.c()))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zc$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */