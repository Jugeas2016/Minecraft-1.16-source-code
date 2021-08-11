/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Stream;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class civ<FC extends cma, F extends cjl<FC>>
/*    */   implements chk<civ<?, ?>>
/*    */ {
/*    */   public static final Codec<civ<?, ?>> a;
/*    */   
/*    */   static {
/* 22 */     a = gm.aE.dispatch(☃ -> ☃.e, cjl::a);
/*    */   }
/* 24 */   public static final Codec<Supplier<civ<?, ?>>> b = vf.a(gm.au, a);
/* 25 */   public static final Codec<List<Supplier<civ<?, ?>>>> c = vf.b(gm.au, a);
/*    */   
/* 27 */   public static final Logger d = LogManager.getLogger();
/*    */   
/*    */   public final F e;
/*    */   public final FC f;
/*    */   
/*    */   public civ(F ☃, FC fC) {
/* 33 */     this.e = ☃;
/* 34 */     this.f = fC;
/*    */   }
/*    */   
/*    */   public F b() {
/* 38 */     return this.e;
/*    */   }
/*    */   
/*    */   public FC c() {
/* 42 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public civ<?, ?> b(cpo<?> ☃) {
/* 47 */     return cjl.aa.b(new clv(() -> this, ☃));
/*    */   }
/*    */   
/*    */   public clj a(float ☃) {
/* 51 */     return new clj(this, ☃);
/*    */   }
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1) {
/* 55 */     return this.e.a(☃, cfy1, random, fx1, this.f);
/*    */   }
/*    */   
/*    */   public Stream<civ<?, ?>> d() {
/* 59 */     return Stream.concat(Stream.of(this), this.f.an_());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\civ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */