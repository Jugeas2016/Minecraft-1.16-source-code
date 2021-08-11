/*    */ import com.mojang.brigadier.StringReader;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements hf.a<he>
/*    */ {
/*    */   public he a(hg<he> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 20 */     stringReader.expect(' ');
/* 21 */     ey ey = (new ey(stringReader, false)).h();
/* 22 */     bmb bmb = (new ex(ey.b(), ey.c())).a(1, false);
/* 23 */     return new he(☃, bmb);
/*    */   }
/*    */ 
/*    */   
/*    */   public he a(hg<he> ☃, nf nf1) {
/* 28 */     return new he(☃, nf1.n());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\he$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */