/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public class hd
/*    */   implements hf
/*    */ {
/* 14 */   public static final hd a = new hd(1.0F, 0.0F, 0.0F, 1.0F);
/*    */   static {
/* 16 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.FLOAT.fieldOf("r").forGetter(()), (App)Codec.FLOAT.fieldOf("g").forGetter(()), (App)Codec.FLOAT.fieldOf("b").forGetter(()), (App)Codec.FLOAT.fieldOf("scale").forGetter(())).apply((Applicative)☃, hd::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<hd> b;
/*    */ 
/*    */   
/* 23 */   public static final hf.a<hd> c = new hf.a<hd>()
/*    */     {
/*    */       public hd a(hg<hd> ☃, StringReader stringReader) throws CommandSyntaxException
/*    */       {
/* 27 */         stringReader.expect(' ');
/* 28 */         float f1 = (float)stringReader.readDouble();
/* 29 */         stringReader.expect(' ');
/* 30 */         float f2 = (float)stringReader.readDouble();
/* 31 */         stringReader.expect(' ');
/* 32 */         float f3 = (float)stringReader.readDouble();
/* 33 */         stringReader.expect(' ');
/* 34 */         float f4 = (float)stringReader.readDouble();
/* 35 */         return new hd(f1, f2, f3, f4);
/*    */       }
/*    */ 
/*    */       
/*    */       public hd a(hg<hd> ☃, nf nf1) {
/* 40 */         return new hd(nf1.readFloat(), nf1.readFloat(), nf1.readFloat(), nf1.readFloat());
/*    */       }
/*    */     };
/*    */   
/*    */   private final float d;
/*    */   private final float e;
/*    */   private final float f;
/*    */   private final float g;
/*    */   
/*    */   public hd(float ☃, float f1, float f2, float f3) {
/* 50 */     this.d = ☃;
/* 51 */     this.e = f1;
/* 52 */     this.f = f2;
/*    */     
/* 54 */     this.g = afm.a(f3, 0.01F, 4.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) {
/* 59 */     ☃.writeFloat(this.d);
/* 60 */     ☃.writeFloat(this.e);
/* 61 */     ☃.writeFloat(this.f);
/* 62 */     ☃.writeFloat(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 67 */     return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", new Object[] { gm.V.b(b()), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g) });
/*    */   }
/*    */ 
/*    */   
/*    */   public hg<hd> b() {
/* 72 */     return hh.o;
/*    */   }
/*    */   
/*    */   public float c() {
/* 76 */     return this.d;
/*    */   }
/*    */   
/*    */   public float d() {
/* 80 */     return this.e;
/*    */   }
/*    */   
/*    */   public float e() {
/* 84 */     return this.f;
/*    */   }
/*    */   
/*    */   public float f() {
/* 88 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */