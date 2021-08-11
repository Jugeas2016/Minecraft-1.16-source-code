/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class he
/*    */   implements hf
/*    */ {
/*    */   public static Codec<he> a(hg<he> ☃) {
/* 14 */     return bmb.a.xmap(bmb1 -> new he(☃, bmb1), ☃ -> ☃.c);
/*    */   }
/*    */   
/* 17 */   public static final hf.a<he> a = new hf.a<he>()
/*    */     {
/*    */       public he a(hg<he> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 20 */         stringReader.expect(' ');
/* 21 */         ey ey = (new ey(stringReader, false)).h();
/* 22 */         bmb bmb = (new ex(ey.b(), ey.c())).a(1, false);
/* 23 */         return new he(☃, bmb);
/*    */       }
/*    */ 
/*    */       
/*    */       public he a(hg<he> ☃, nf nf1) {
/* 28 */         return new he(☃, nf1.n());
/*    */       }
/*    */     };
/*    */   
/*    */   private final hg<he> b;
/*    */   private final bmb c;
/*    */   
/*    */   public he(hg<he> ☃, bmb bmb1) {
/* 36 */     this.b = ☃;
/* 37 */     this.c = bmb1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) {
/* 42 */     ☃.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 47 */     return gm.V.b(b()) + " " + (new ex(this.c.b(), this.c.o())).c();
/*    */   }
/*    */ 
/*    */   
/*    */   public hg<he> b() {
/* 52 */     return this.b;
/*    */   }
/*    */   
/*    */   public bmb c() {
/* 56 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\he.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */