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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements hf.a<hd>
/*    */ {
/*    */   public hd a(hg<hd> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 27 */     stringReader.expect(' ');
/* 28 */     float f1 = (float)stringReader.readDouble();
/* 29 */     stringReader.expect(' ');
/* 30 */     float f2 = (float)stringReader.readDouble();
/* 31 */     stringReader.expect(' ');
/* 32 */     float f3 = (float)stringReader.readDouble();
/* 33 */     stringReader.expect(' ');
/* 34 */     float f4 = (float)stringReader.readDouble();
/* 35 */     return new hd(f1, f2, f3, f4);
/*    */   }
/*    */ 
/*    */   
/*    */   public hd a(hg<hd> ☃, nf nf1) {
/* 40 */     return new hd(nf1.readFloat(), nf1.readFloat(), nf1.readFloat(), nf1.readFloat());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hd$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */