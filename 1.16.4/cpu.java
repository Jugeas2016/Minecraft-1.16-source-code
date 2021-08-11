/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cpu implements clw {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cpo.a.fieldOf("outer").forGetter(cpu::a), (App)cpo.a.fieldOf("inner").forGetter(cpu::b)).apply((Applicative)☃, cpu::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cpu> a;
/*    */   
/*    */   private final cpo<?> c;
/*    */   private final cpo<?> d;
/*    */   
/*    */   public cpu(cpo<?> ☃, cpo<?> cpo1) {
/* 18 */     this.c = ☃;
/* 19 */     this.d = cpo1;
/*    */   }
/*    */   
/*    */   public cpo<?> a() {
/* 23 */     return this.c;
/*    */   }
/*    */   
/*    */   public cpo<?> b() {
/* 27 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */