/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class rt
/*     */   implements oj<om>
/*     */ {
/*     */   private boolean a;
/*     */   private Map<vk, y.a> b;
/*     */   private Set<vk> c;
/*     */   private Map<vk, aa> d;
/*     */   
/*     */   public rt() {}
/*     */   
/*     */   public rt(boolean ☃, Collection<y> collection, Set<vk> set, Map<vk, aa> map) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = Maps.newHashMap();
/*  28 */     for (y y : collection) {
/*  29 */       this.b.put(y.h(), y.a());
/*     */     }
/*  31 */     this.c = set;
/*  32 */     this.d = Maps.newHashMap(map);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  37 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  42 */     this.a = ☃.readBoolean();
/*  43 */     this.b = Maps.newHashMap();
/*  44 */     this.c = Sets.newLinkedHashSet();
/*  45 */     this.d = Maps.newHashMap();
/*     */     
/*  47 */     int i = ☃.i(); int j;
/*  48 */     for (j = 0; j < i; j++) {
/*  49 */       vk vk = ☃.p();
/*  50 */       y.a a = y.a.b(☃);
/*  51 */       this.b.put(vk, a);
/*     */     } 
/*     */     
/*  54 */     i = ☃.i();
/*  55 */     for (j = 0; j < i; j++) {
/*  56 */       vk vk = ☃.p();
/*  57 */       this.c.add(vk);
/*     */     } 
/*     */     
/*  60 */     i = ☃.i();
/*  61 */     for (j = 0; j < i; j++) {
/*  62 */       vk vk = ☃.p();
/*  63 */       this.d.put(vk, aa.b(☃));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  69 */     ☃.writeBoolean(this.a);
/*     */     
/*  71 */     ☃.d(this.b.size());
/*  72 */     for (Map.Entry<vk, y.a> entry : this.b.entrySet()) {
/*  73 */       vk vk = entry.getKey();
/*  74 */       y.a a = entry.getValue();
/*  75 */       ☃.a(vk);
/*  76 */       a.a(☃);
/*     */     } 
/*     */     
/*  79 */     ☃.d(this.c.size());
/*  80 */     for (vk vk : this.c) {
/*  81 */       ☃.a(vk);
/*     */     }
/*     */     
/*  84 */     ☃.d(this.d.size());
/*  85 */     for (Map.Entry<vk, aa> entry : this.d.entrySet()) {
/*  86 */       ☃.a(entry.getKey());
/*  87 */       ((aa)entry.getValue()).a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<vk, y.a> b() {
/*  92 */     return this.b;
/*     */   }
/*     */   
/*     */   public Set<vk> c() {
/*  96 */     return this.c;
/*     */   }
/*     */   
/*     */   public Map<vk, aa> d() {
/* 100 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 104 */     return this.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */