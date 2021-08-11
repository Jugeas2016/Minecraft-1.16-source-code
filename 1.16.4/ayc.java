/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayc<T>
/*    */ {
/*    */   private final T a;
/*    */   private long b;
/*    */   
/*    */   public ayc(T ☃, long l) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = l;
/*    */   }
/*    */   
/*    */   public void a() {
/* 23 */     if (e()) {
/* 24 */       this.b--;
/*    */     }
/*    */   }
/*    */   
/*    */   public static <T> ayc<T> a(T ☃) {
/* 29 */     return new ayc<>(☃, Long.MAX_VALUE);
/*    */   }
/*    */   
/*    */   public static <T> ayc<T> a(T ☃, long l) {
/* 33 */     return new ayc<>(☃, l);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public T c() {
/* 41 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 45 */     return (this.b <= 0L);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 50 */     return this.a.toString() + (e() ? (" (ttl: " + this.b + ")") : "");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean e() {
/* 56 */     return (this.b != Long.MAX_VALUE);
/*    */   }
/*    */   
/*    */   public static <T> Codec<ayc<T>> a(Codec<T> ☃) {
/* 60 */     return RecordCodecBuilder.create(instance -> instance.group((App)☃.fieldOf("value").forGetter(()), (App)Codec.LONG.optionalFieldOf("ttl").forGetter(())).apply((Applicative)instance, ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */