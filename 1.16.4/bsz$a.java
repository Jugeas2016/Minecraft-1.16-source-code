/*     */ import java.util.Optional;
/*     */ import java.util.OptionalInt;
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
/*     */ public class a
/*     */ {
/* 108 */   private OptionalInt a = OptionalInt.empty();
/* 109 */   private OptionalInt b = OptionalInt.empty();
/* 110 */   private OptionalInt c = OptionalInt.empty();
/* 111 */   private OptionalInt d = OptionalInt.empty();
/* 112 */   private Optional<Integer> e = Optional.empty();
/* 113 */   private Optional<Integer> f = Optional.empty();
/* 114 */   private bsz.b g = bsz.b.a;
/* 115 */   private Optional<bsu> h = Optional.empty();
/* 116 */   private Optional<adp> i = Optional.empty();
/* 117 */   private Optional<bst> j = Optional.empty();
/* 118 */   private Optional<bss> k = Optional.empty();
/* 119 */   private Optional<adn> l = Optional.empty();
/*     */   
/*     */   public a a(int ☃) {
/* 122 */     this.a = OptionalInt.of(☃);
/* 123 */     return this;
/*     */   }
/*     */   
/*     */   public a b(int ☃) {
/* 127 */     this.b = OptionalInt.of(☃);
/* 128 */     return this;
/*     */   }
/*     */   
/*     */   public a c(int ☃) {
/* 132 */     this.c = OptionalInt.of(☃);
/* 133 */     return this;
/*     */   }
/*     */   
/*     */   public a d(int ☃) {
/* 137 */     this.d = OptionalInt.of(☃);
/* 138 */     return this;
/*     */   }
/*     */   
/*     */   public a e(int ☃) {
/* 142 */     this.e = Optional.of(Integer.valueOf(☃));
/* 143 */     return this;
/*     */   }
/*     */   
/*     */   public a f(int ☃) {
/* 147 */     this.f = Optional.of(Integer.valueOf(☃));
/* 148 */     return this;
/*     */   }
/*     */   
/*     */   public a a(bsz.b ☃) {
/* 152 */     this.g = ☃;
/* 153 */     return this;
/*     */   }
/*     */   
/*     */   public a a(bsu ☃) {
/* 157 */     this.h = Optional.of(☃);
/* 158 */     return this;
/*     */   }
/*     */   
/*     */   public a a(adp ☃) {
/* 162 */     this.i = Optional.of(☃);
/* 163 */     return this;
/*     */   }
/*     */   
/*     */   public a a(bst ☃) {
/* 167 */     this.j = Optional.of(☃);
/* 168 */     return this;
/*     */   }
/*     */   
/*     */   public a a(bss ☃) {
/* 172 */     this.k = Optional.of(☃);
/* 173 */     return this;
/*     */   }
/*     */   
/*     */   public a a(adn ☃) {
/* 177 */     this.l = Optional.of(☃);
/* 178 */     return this;
/*     */   }
/*     */   
/*     */   public bsz a() {
/* 182 */     return new bsz(this.a
/* 183 */         .orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")), this.b
/* 184 */         .orElseThrow(() -> new IllegalStateException("Missing 'water' color.")), this.c
/* 185 */         .orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")), this.d
/* 186 */         .orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */