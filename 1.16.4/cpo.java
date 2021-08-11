/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class cpo<DC extends clw>
/*    */   implements chk<cpo<?>>
/*    */ {
/*    */   public static final Codec<cpo<?>> a;
/*    */   private final cqc<DC> b;
/*    */   private final DC c;
/*    */   
/*    */   static {
/* 13 */     a = gm.aK.dispatch("type", ☃ -> ☃.b, cqc::a);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public cpo(cqc<DC> ☃, DC dC) {
/* 19 */     this.b = ☃;
/* 20 */     this.c = dC;
/*    */   }
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, fx fx1) {
/* 24 */     return this.b.a(☃, random, this.c, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 29 */     return String.format("[%s %s]", new Object[] { gm.aK.b(this.b), this.c });
/*    */   }
/*    */ 
/*    */   
/*    */   public cpo<?> b(cpo<?> ☃) {
/* 34 */     return new cpo((cqc)cqc.B, (DC)new cpu(☃, this));
/*    */   }
/*    */   
/*    */   public DC b() {
/* 38 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */