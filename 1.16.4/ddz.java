/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.OptionalInt;
/*    */ import javax.annotation.Nullable;
/*    */ import javax.sound.sampled.AudioFormat;
/*    */ import org.lwjgl.openal.AL10;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ddz
/*    */ {
/*    */   @Nullable
/*    */   private ByteBuffer a;
/*    */   private final AudioFormat b;
/*    */   private boolean c;
/*    */   private int d;
/*    */   
/*    */   public ddz(ByteBuffer ☃, AudioFormat audioFormat) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = audioFormat;
/*    */   }
/*    */   
/*    */   OptionalInt a() {
/* 25 */     if (!this.c) {
/* 26 */       if (this.a == null) {
/* 27 */         return OptionalInt.empty();
/*    */       }
/* 29 */       int ☃ = ddy.a(this.b);
/* 30 */       int[] arrayOfInt = new int[1];
/* 31 */       AL10.alGenBuffers(arrayOfInt);
/* 32 */       if (ddy.a("Creating buffer")) {
/* 33 */         return OptionalInt.empty();
/*    */       }
/* 35 */       AL10.alBufferData(arrayOfInt[0], ☃, this.a, (int)this.b.getSampleRate());
/* 36 */       if (ddy.a("Assigning buffer data")) {
/* 37 */         return OptionalInt.empty();
/*    */       }
/* 39 */       this.d = arrayOfInt[0];
/* 40 */       this.c = true;
/* 41 */       this.a = null;
/*    */     } 
/*    */     
/* 44 */     return OptionalInt.of(this.d);
/*    */   }
/*    */   
/*    */   public void b() {
/* 48 */     if (this.c) {
/* 49 */       AL10.alDeleteBuffers(new int[] { this.d });
/* 50 */       if (ddy.a("Deleting stream buffers")) {
/*    */         return;
/*    */       }
/*    */     } 
/* 54 */     this.c = false;
/*    */   }
/*    */   
/*    */   public OptionalInt c() {
/* 58 */     OptionalInt ☃ = a();
/* 59 */     this.c = false;
/* 60 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */