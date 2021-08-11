/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ public class hi
/*    */   extends hg<hi>
/*    */   implements hf
/*    */ {
/* 10 */   private static final hf.a<hi> a = new hf.a<hi>()
/*    */     {
/*    */       public hi a(hg<hi> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 13 */         return (hi)☃;
/*    */       }
/*    */ 
/*    */       
/*    */       public hi a(hg<hi> ☃, nf nf1) {
/* 18 */         return (hi)☃;
/*    */       }
/*    */     };
/*    */   
/* 22 */   private final Codec<hi> b = Codec.unit(this::f);
/*    */   
/*    */   protected hi(boolean ☃) {
/* 25 */     super(☃, a);
/*    */   }
/*    */ 
/*    */   
/*    */   public hi f() {
/* 30 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public Codec<hi> e() {
/* 35 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(nf ☃) {}
/*    */ 
/*    */   
/*    */   public String a() {
/* 44 */     return gm.V.b(this).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */