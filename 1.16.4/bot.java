/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bot<T extends boq<?>>
/*    */ {
/* 11 */   public static final bot<boi> a = a("crafting");
/* 12 */   public static final bot<bpc> b = a("smelting");
/* 13 */   public static final bot<bof> c = a("blasting");
/* 14 */   public static final bot<bpd> d = a("smoking");
/* 15 */   public static final bot<boh> e = a("campfire_cooking");
/* 16 */   public static final bot<bpe> f = a("stonecutting");
/* 17 */   public static final bot<bph> g = a("smithing");
/*    */   
/*    */   static <T extends boq<?>> bot<T> a(String ☃) {
/* 20 */     return gm.<bot<?>, bot<T>>a(gm.ad, new vk(☃), new bot<T>(☃)
/*    */         {
/*    */           public String toString() {
/* 23 */             return this.h;
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   default <C extends aon> Optional<T> a(boq<C> ☃, brx brx1, C c) {
/* 30 */     return ☃.a(c, brx1) ? Optional.<T>of((T)☃) : Optional.<T>empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */