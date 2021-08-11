/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class ctu implements ctv {
/*    */   static {
/*  9 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("top_material").forGetter(()), (App)ceh.b.fieldOf("under_material").forGetter(()), (App)ceh.b.fieldOf("underwater_material").forGetter(())).apply((Applicative)☃, ctu::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<ctu> a;
/*    */   
/*    */   private final ceh b;
/*    */   private final ceh c;
/*    */   private final ceh d;
/*    */   
/*    */   public ctu(ceh ☃, ceh ceh1, ceh ceh2) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = ceh1;
/* 22 */     this.d = ceh2;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a() {
/* 27 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh b() {
/* 32 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh c() {
/* 37 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */