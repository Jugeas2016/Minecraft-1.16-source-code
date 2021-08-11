/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cpe {
/*    */   public static final Codec<cpe> a;
/*    */   private final ceh b;
/*    */   
/*    */   static {
/* 12 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 256).fieldOf("height").forGetter(cpe::a), (App)gm.Q.fieldOf("block").orElse(bup.a).forGetter(())).apply((Applicative)☃, cpe::new));
/*    */   }
/*    */ 
/*    */   
/*    */   private final int c;
/*    */   
/*    */   private int d;
/*    */ 
/*    */   
/*    */   public cpe(int ☃, buo buo1) {
/* 22 */     this.c = ☃;
/* 23 */     this.b = buo1.n();
/*    */   }
/*    */   
/*    */   public int a() {
/* 27 */     return this.c;
/*    */   }
/*    */   
/*    */   public ceh b() {
/* 31 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 35 */     return this.d;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 39 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 44 */     return ((this.c != 1) ? (this.c + "*") : "") + gm.Q.b(this.b.b());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */