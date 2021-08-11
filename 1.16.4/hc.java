/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hc
/*    */   implements hf
/*    */ {
/*    */   public static Codec<hc> a(hg<hc> ☃) {
/* 14 */     return ceh.b.xmap(ceh1 -> new hc(☃, ceh1), ☃ -> ☃.c);
/*    */   }
/*    */   
/* 17 */   public static final hf.a<hc> a = new hf.a<hc>()
/*    */     {
/*    */       public hc a(hg<hc> ☃, StringReader stringReader) throws CommandSyntaxException {
/* 20 */         stringReader.expect(' ');
/* 21 */         return new hc(☃, (new ei(stringReader, false)).a(false).b());
/*    */       }
/*    */ 
/*    */       
/*    */       public hc a(hg<hc> ☃, nf nf1) {
/* 26 */         return new hc(☃, buo.m.a(nf1.i()));
/*    */       }
/*    */     };
/*    */   
/*    */   private final hg<hc> b;
/*    */   private final ceh c;
/*    */   
/*    */   public hc(hg<hc> ☃, ceh ceh1) {
/* 34 */     this.b = ☃;
/* 35 */     this.c = ceh1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) {
/* 40 */     ☃.d(buo.m.a(this.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 45 */     return gm.V.b(b()) + " " + ei.a(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public hg<hc> b() {
/* 50 */     return this.b;
/*    */   }
/*    */   
/*    */   public ceh c() {
/* 54 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */