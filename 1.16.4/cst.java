/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class cst
/*    */   extends csy {
/*    */   public static final Codec<cst> a;
/*    */   private final ImmutableList<csq> b;
/*    */   
/*    */   static {
/* 15 */     a = csq.a.listOf().fieldOf("rules").xmap(cst::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public cst(List<? extends csq> ☃) {
/* 20 */     this.b = ImmutableList.copyOf(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/* 26 */     Random random = new Random(afm.a(c2.a));
/* 27 */     ceh ceh = ☃.d_(c2.a);
/* 28 */     for (UnmodifiableIterator<csq> unmodifiableIterator = this.b.iterator(); unmodifiableIterator.hasNext(); ) { csq csq = unmodifiableIterator.next();
/* 29 */       if (csq.a(c2.b, ceh, c1.a, c2.a, fx2, random)) {
/* 30 */         return new ctb.c(c2.a, csq.a(), csq.b());
/*    */       } }
/*    */     
/* 33 */     return c2;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cta<?> a() {
/* 38 */     return cta.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cst.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */