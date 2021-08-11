/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public final class gf {
/*    */   public static final Codec<gf> a;
/*    */   
/*    */   static {
/* 11 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)brx.f.fieldOf("dimension").forGetter(gf::a), (App)fx.a.fieldOf("pos").forGetter(gf::b)).apply((Applicative)☃, gf::a));
/*    */   }
/*    */ 
/*    */   
/*    */   private final vj<brx> b;
/*    */   
/*    */   private final fx c;
/*    */   
/*    */   private gf(vj<brx> ☃, fx fx1) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = fx1;
/*    */   }
/*    */   
/*    */   public static gf a(vj<brx> ☃, fx fx1) {
/* 25 */     return new gf(☃, fx1);
/*    */   }
/*    */   
/*    */   public vj<brx> a() {
/* 29 */     return this.b;
/*    */   }
/*    */   
/*    */   public fx b() {
/* 33 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 38 */     if (this == ☃) {
/* 39 */       return true;
/*    */     }
/* 41 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 42 */       return false;
/*    */     }
/* 44 */     gf gf1 = (gf)☃;
/* 45 */     return (Objects.equals(this.b, gf1.b) && Objects.equals(this.c, gf1.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 50 */     return Objects.hash(new Object[] { this.b, this.c });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 55 */     return this.b.toString() + " " + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */