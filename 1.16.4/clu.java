/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class clu
/*    */   implements clw, cma
/*    */ {
/*  7 */   public static final Codec<clu> a = afw.a(-10, 128, 128).fieldOf("count")
/*  8 */     .xmap(clu::new, clu::a).codec();
/*    */   
/*    */   private final afw c;
/*    */   
/*    */   public clu(int ☃) {
/* 13 */     this.c = afw.a(☃);
/*    */   }
/*    */   
/*    */   public clu(afw ☃) {
/* 17 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public afw a() {
/* 21 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */