/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a<T extends ccj>
/*     */ {
/*     */   private final Supplier<? extends T> a;
/*     */   private final Set<buo> b;
/*     */   
/*     */   private a(Supplier<? extends T> ☃, Set<buo> set) {
/*  98 */     this.a = ☃;
/*  99 */     this.b = set;
/*     */   }
/*     */   
/*     */   public static <T extends ccj> a<T> a(Supplier<? extends T> ☃, buo... arrayOfBuo) {
/* 103 */     return new a<>(☃, (Set<buo>)ImmutableSet.copyOf((Object[])arrayOfBuo));
/*     */   }
/*     */   
/*     */   public cck<T> a(Type<?> ☃) {
/* 107 */     return new cck<>(this.a, this.b, ☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cck$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */