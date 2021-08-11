/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.ResultConsumer;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BinaryOperator;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class db
/*     */   implements dd
/*     */ {
/*  39 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("permissions.requires.player"));
/*  40 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("permissions.requires.entity"));
/*     */   
/*     */   private final da c;
/*     */   private final dcn d;
/*     */   private final aag e;
/*     */   private final int f;
/*     */   private final String g;
/*     */   private final nr h;
/*     */   private final MinecraftServer i;
/*     */   private final boolean j;
/*     */   @Nullable
/*     */   private final aqa k;
/*     */   private final ResultConsumer<db> l;
/*     */   private final dj.a m;
/*     */   private final dcm n;
/*     */   
/*     */   public db(da ☃, dcn dcn1, dcm dcm1, aag aag1, int i, String str, nr nr1, MinecraftServer minecraftServer, @Nullable aqa aqa1) {
/*  57 */     this(☃, dcn1, dcm1, aag1, i, str, nr1, minecraftServer, aqa1, false, (☃, bool, i) -> {  }dj.a.a);
/*     */   }
/*     */   
/*     */   protected db(da ☃, dcn dcn1, dcm dcm1, aag aag1, int i, String str, nr nr1, MinecraftServer minecraftServer, @Nullable aqa aqa1, boolean bool, ResultConsumer<db> resultConsumer, dj.a a1) {
/*  61 */     this.c = ☃;
/*  62 */     this.d = dcn1;
/*  63 */     this.e = aag1;
/*  64 */     this.j = bool;
/*  65 */     this.k = aqa1;
/*  66 */     this.f = i;
/*  67 */     this.g = str;
/*  68 */     this.h = nr1;
/*  69 */     this.i = minecraftServer;
/*  70 */     this.l = resultConsumer;
/*  71 */     this.m = a1;
/*  72 */     this.n = dcm1;
/*     */   }
/*     */   
/*     */   public db a(aqa ☃) {
/*  76 */     if (this.k == ☃) {
/*  77 */       return this;
/*     */     }
/*  79 */     return new db(this.c, this.d, this.n, this.e, this.f, ☃.R().getString(), ☃.d(), this.i, ☃, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db a(dcn ☃) {
/*  83 */     if (this.d.equals(☃)) {
/*  84 */       return this;
/*     */     }
/*  86 */     return new db(this.c, ☃, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db a(dcm ☃) {
/*  90 */     if (this.n.c(☃)) {
/*  91 */       return this;
/*     */     }
/*  93 */     return new db(this.c, this.d, ☃, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db a(ResultConsumer<db> ☃) {
/*  97 */     if (this.l.equals(☃)) {
/*  98 */       return this;
/*     */     }
/* 100 */     return new db(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, ☃, this.m);
/*     */   }
/*     */   
/*     */   public db a(ResultConsumer<db> ☃, BinaryOperator<ResultConsumer<db>> binaryOperator) {
/* 104 */     ResultConsumer<db> resultConsumer = binaryOperator.apply(this.l, ☃);
/* 105 */     return a(resultConsumer);
/*     */   }
/*     */   
/*     */   public db a() {
/* 109 */     if (this.j) {
/* 110 */       return this;
/*     */     }
/* 112 */     return new db(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, true, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db a(int ☃) {
/* 116 */     if (☃ == this.f) {
/* 117 */       return this;
/*     */     }
/* 119 */     return new db(this.c, this.d, this.n, this.e, ☃, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db b(int ☃) {
/* 123 */     if (☃ <= this.f) {
/* 124 */       return this;
/*     */     }
/* 126 */     return new db(this.c, this.d, this.n, this.e, ☃, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db a(dj.a ☃) {
/* 130 */     if (☃ == this.m) {
/* 131 */       return this;
/*     */     }
/* 133 */     return new db(this.c, this.d, this.n, this.e, this.f, this.g, this.h, this.i, this.k, this.j, this.l, ☃);
/*     */   }
/*     */   
/*     */   public db a(aag ☃) {
/* 137 */     if (☃ == this.e) {
/* 138 */       return this;
/*     */     }
/* 140 */     double d = chd.a(this.e.k(), ☃.k());
/* 141 */     dcn dcn1 = new dcn(this.d.b * d, this.d.c, this.d.d * d);
/* 142 */     return new db(this.c, dcn1, this.n, ☃, this.f, this.g, this.h, this.i, this.k, this.j, this.l, this.m);
/*     */   }
/*     */   
/*     */   public db a(aqa ☃, dj.a a1) throws CommandSyntaxException {
/* 146 */     return b(a1.a(☃));
/*     */   }
/*     */   
/*     */   public db b(dcn ☃) throws CommandSyntaxException {
/* 150 */     dcn dcn1 = this.m.a(this);
/* 151 */     double d1 = ☃.b - dcn1.b;
/* 152 */     double d2 = ☃.c - dcn1.c;
/* 153 */     double d3 = ☃.d - dcn1.d;
/* 154 */     double d4 = afm.a(d1 * d1 + d3 * d3);
/*     */     
/* 156 */     float f1 = afm.g((float)-(afm.d(d2, d4) * 57.2957763671875D));
/* 157 */     float f2 = afm.g((float)(afm.d(d3, d1) * 57.2957763671875D) - 90.0F);
/* 158 */     return a(new dcm(f1, f2));
/*     */   }
/*     */   
/*     */   public nr b() {
/* 162 */     return this.h;
/*     */   }
/*     */   
/*     */   public String c() {
/* 166 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃) {
/* 171 */     return (this.f >= ☃);
/*     */   }
/*     */   
/*     */   public dcn d() {
/* 175 */     return this.d;
/*     */   }
/*     */   
/*     */   public aag e() {
/* 179 */     return this.e;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa f() {
/* 184 */     return this.k;
/*     */   }
/*     */   
/*     */   public aqa g() throws CommandSyntaxException {
/* 188 */     if (this.k == null) {
/* 189 */       throw b.create();
/*     */     }
/* 191 */     return this.k;
/*     */   }
/*     */   
/*     */   public aah h() throws CommandSyntaxException {
/* 195 */     if (!(this.k instanceof aah)) {
/* 196 */       throw a.create();
/*     */     }
/* 198 */     return (aah)this.k;
/*     */   }
/*     */   
/*     */   public dcm i() {
/* 202 */     return this.n;
/*     */   }
/*     */   
/*     */   public MinecraftServer j() {
/* 206 */     return this.i;
/*     */   }
/*     */   
/*     */   public dj.a k() {
/* 210 */     return this.m;
/*     */   }
/*     */   
/*     */   public void a(nr ☃, boolean bool) {
/* 214 */     if (this.c.a() && !this.j) {
/* 215 */       this.c.a(☃, x.b);
/*     */     }
/* 217 */     if (bool && this.c.R_() && !this.j) {
/* 218 */       b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(nr ☃) {
/* 223 */     nr nr1 = (new of("chat.type.admin", new Object[] { b(), ☃ })).a(new k[] { k.h, k.u });
/*     */     
/* 225 */     if (this.i.aL().b(brt.n)) {
/* 226 */       for (aah aah : this.i.ae().s()) {
/* 227 */         if (aah != this.c && this.i.ae().h(aah.eA())) {
/* 228 */           aah.a(nr1, x.b);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 233 */     if (this.c != this.i && this.i.aL().b(brt.k)) {
/* 234 */       this.i.a(nr1, x.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/* 239 */     if (this.c.b() && !this.j) {
/* 240 */       this.c.a((new oe("")).a(☃).a(k.m), x.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(CommandContext<db> ☃, boolean bool, int i) {
/* 245 */     if (this.l != null) {
/* 246 */       this.l.onCommandComplete(☃, bool, i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> l() {
/* 252 */     return Lists.newArrayList((Object[])this.i.K());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> m() {
/* 257 */     return this.i.aH().f();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> n() {
/* 262 */     return gm.N.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<vk> o() {
/* 267 */     return this.i.aF().d();
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Suggestions> a(CommandContext<dd> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 272 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<vj<brx>> p() {
/* 277 */     return this.i.F();
/*     */   }
/*     */ 
/*     */   
/*     */   public gn q() {
/* 282 */     return this.i.aY();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\db.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */