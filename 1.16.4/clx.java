/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class clx implements cma {
/*    */   static {
/*  9 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("contents").forGetter(()), (App)ceh.b.fieldOf("rim").forGetter(()), (App)afw.a(0, 8, 8).fieldOf("size").forGetter(()), (App)afw.a(0, 8, 8).fieldOf("rim_size").forGetter(())).apply((Applicative)☃, clx::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<clx> a;
/*    */   
/*    */   private final ceh b;
/*    */   
/*    */   private final ceh c;
/*    */   private final afw d;
/*    */   private final afw e;
/*    */   
/*    */   public clx(ceh ☃, ceh ceh1, afw afw1, afw afw2) {
/* 22 */     this.b = ☃;
/* 23 */     this.c = ceh1;
/* 24 */     this.d = afw1;
/* 25 */     this.e = afw2;
/*    */   }
/*    */   
/*    */   public ceh b() {
/* 29 */     return this.b;
/*    */   }
/*    */   
/*    */   public ceh c() {
/* 33 */     return this.c;
/*    */   }
/*    */   
/*    */   public afw d() {
/* 37 */     return this.d;
/*    */   }
/*    */   
/*    */   public afw e() {
/* 41 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */