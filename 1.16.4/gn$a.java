/*    */ import com.mojang.serialization.Codec;
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
/*    */ final class a<E>
/*    */ {
/*    */   private final vj<? extends gm<E>> a;
/*    */   private final Codec<E> b;
/*    */   @Nullable
/*    */   private final Codec<E> c;
/*    */   
/*    */   public a(vj<? extends gm<E>> ☃, Codec<E> codec1, @Nullable Codec<E> codec2) {
/* 52 */     this.a = ☃;
/* 53 */     this.b = codec1;
/* 54 */     this.c = codec2;
/*    */   }
/*    */   
/*    */   public vj<? extends gm<E>> a() {
/* 58 */     return this.a;
/*    */   }
/*    */   
/*    */   public Codec<E> b() {
/* 62 */     return this.b;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Codec<E> c() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 71 */     return (this.c != null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */