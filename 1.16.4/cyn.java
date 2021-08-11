/*    */ import com.mojang.serialization.Lifecycle;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cyn
/*    */ {
/*    */   default void a(m ☃) {
/* 32 */     ☃.a("Known server brands", () -> String.join(", ", (Iterable)G()));
/* 33 */     ☃.a("Level was modded", () -> Boolean.toString(F()));
/* 34 */     ☃.a("Level storage version", () -> {
/*    */           int ☃ = z();
/*    */           return String.format("0x%05X - %s", new Object[] { Integer.valueOf(☃), i(☃) });
/*    */         });
/*    */   }
/*    */   
/*    */   default String i(int ☃) {
/* 41 */     switch (☃) {
/*    */       case 19133:
/* 43 */         return "Anvil";
/*    */       case 19132:
/* 45 */         return "McRegion";
/*    */     } 
/* 47 */     return "Unknown?";
/*    */   }
/*    */   
/*    */   brk D();
/*    */   
/*    */   void a(brk parambrk);
/*    */   
/*    */   boolean F();
/*    */   
/*    */   Set<String> G();
/*    */   
/*    */   void a(String paramString, boolean paramBoolean);
/*    */   
/*    */   @Nullable
/*    */   md E();
/*    */   
/*    */   void b(@Nullable md parammd);
/*    */   
/*    */   cym H();
/*    */   
/*    */   bsa I();
/*    */   
/*    */   md a(gn paramgn, @Nullable md parammd);
/*    */   
/*    */   boolean n();
/*    */   
/*    */   int z();
/*    */   
/*    */   String g();
/*    */   
/*    */   bru m();
/*    */   
/*    */   void a(bru parambru);
/*    */   
/*    */   boolean o();
/*    */   
/*    */   aor s();
/*    */   
/*    */   void a(aor paramaor);
/*    */   
/*    */   boolean t();
/*    */   
/*    */   void d(boolean paramBoolean);
/*    */   
/*    */   brt q();
/*    */   
/*    */   md y();
/*    */   
/*    */   md C();
/*    */   
/*    */   void a(md parammd);
/*    */   
/*    */   chw A();
/*    */   
/*    */   Lifecycle B();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */