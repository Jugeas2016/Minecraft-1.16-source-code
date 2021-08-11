/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cse
/*    */   extends csy
/*    */ {
/*    */   public static final Codec<cse> a;
/*    */   
/*    */   static {
/* 21 */     a = ceh.b.xmap(ceg.a::b, buo::n).listOf().fieldOf("blocks").xmap(cse::new, ☃ -> ☃.e).codec();
/*    */   }
/* 23 */   public static final cse b = new cse((List<buo>)ImmutableList.of(bup.mY));
/* 24 */   public static final cse c = new cse((List<buo>)ImmutableList.of(bup.a));
/* 25 */   public static final cse d = new cse((List<buo>)ImmutableList.of(bup.a, bup.mY));
/*    */   
/*    */   private final ImmutableList<buo> e;
/*    */   
/*    */   public cse(List<buo> ☃) {
/* 30 */     this.e = ImmutableList.copyOf(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/* 36 */     if (this.e.contains(c2.b.b())) {
/* 37 */       return null;
/*    */     }
/* 39 */     return c2;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cta<?> a() {
/* 44 */     return cta.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */