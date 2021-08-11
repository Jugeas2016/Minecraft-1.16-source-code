/*    */ import com.mojang.serialization.Lifecycle;
/*    */ import java.util.Optional;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nonnull;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gb<T>
/*    */   extends gi<T>
/*    */ {
/*    */   private final vk bf;
/*    */   private T bg;
/*    */   
/*    */   public gb(String ☃, vj<? extends gm<T>> vj1, Lifecycle lifecycle) {
/* 18 */     super(vj1, lifecycle);
/* 19 */     this.bf = new vk(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public <V extends T> V a(int ☃, vj<T> vj1, V v, Lifecycle lifecycle) {
/* 24 */     if (this.bf.equals(vj1.a())) {
/* 25 */       this.bg = (T)v;
/*    */     }
/*    */     
/* 28 */     return super.a(☃, vj1, v, lifecycle);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(@Nullable T ☃) {
/* 33 */     int i = super.a(☃);
/* 34 */     return (i == -1) ? super.a(this.bg) : i;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public vk b(T ☃) {
/* 40 */     vk vk1 = super.b(☃);
/* 41 */     return (vk1 == null) ? this.bf : vk1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public T a(@Nullable vk ☃) {
/* 47 */     T t = super.a(☃);
/* 48 */     return (t == null) ? this.bg : t;
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<T> b(@Nullable vk ☃) {
/* 53 */     return Optional.ofNullable(super.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public T a(int ☃) {
/* 59 */     T t = super.a(☃);
/* 60 */     return (t == null) ? this.bg : t;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nonnull
/*    */   public T a(Random ☃) {
/* 66 */     T t = super.a(☃);
/* 67 */     return (t == null) ? this.bg : t;
/*    */   }
/*    */   
/*    */   public vk a() {
/* 71 */     return this.bf;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */