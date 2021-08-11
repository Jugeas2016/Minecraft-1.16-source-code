/*      */ import com.google.common.collect.ImmutableMap;
/*      */ import com.google.common.collect.Multimap;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.collect.UnmodifiableIterator;
/*      */ import com.google.gson.JsonElement;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.authlib.GameProfileRepository;
/*      */ import com.mojang.authlib.exceptions.AuthenticationException;
/*      */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*      */ import com.mojang.authlib.minecraft.OfflineSocialInteractions;
/*      */ import com.mojang.authlib.minecraft.SocialInteractionsService;
/*      */ import com.mojang.authlib.properties.PropertyMap;
/*      */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*      */ import com.mojang.blaze3d.systems.RenderSystem;
/*      */ import com.mojang.datafixers.DataFixer;
/*      */ import com.mojang.datafixers.util.Function4;
/*      */ import com.mojang.serialization.DataResult;
/*      */ import com.mojang.serialization.DynamicOps;
/*      */ import com.mojang.serialization.JsonOps;
/*      */ import com.mojang.serialization.Lifecycle;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.net.Proxy;
/*      */ import java.net.SocketAddress;
/*      */ import java.nio.ByteOrder;
/*      */ import java.text.DecimalFormat;
/*      */ import java.text.DecimalFormatSymbols;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Optional;
/*      */ import java.util.Queue;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.CompletableFuture;
/*      */ import java.util.concurrent.CompletionStage;
/*      */ import java.util.concurrent.ExecutionException;
/*      */ import java.util.concurrent.atomic.AtomicReference;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.Supplier;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.client.ClientBrandRetriever;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class djz
/*      */   extends aof<Runnable>
/*      */   implements apd, dfa
/*      */ {
/*      */   private static djz F;
/*  247 */   private static final Logger G = LogManager.getLogger();
/*  248 */   public static final boolean a = (x.i() == x.b.d);
/*      */ 
/*      */   
/*  251 */   public static final vk b = new vk("default");
/*  252 */   public static final vk c = new vk("uniform");
/*  253 */   public static final vk d = new vk("alt");
/*  254 */   private static final CompletableFuture<afx> H = CompletableFuture.completedFuture(afx.a);
/*      */   
/*  256 */   private static final nr I = new of("multiplayer.socialInteractions.not_available");
/*      */   
/*      */   private final File J;
/*      */   
/*      */   private final PropertyMap K;
/*      */   
/*      */   private final ekd L;
/*      */   
/*      */   private final DataFixer M;
/*      */   
/*      */   private final eau N;
/*      */   
/*      */   private final dez O;
/*      */   
/*      */   private final dkk P;
/*      */   
/*      */   private final apc Q;
/*      */   
/*      */   private final eam R;
/*      */   
/*      */   public final eae e;
/*      */   
/*      */   private final eet S;
/*      */   
/*      */   private final efo T;
/*      */   private final eac U;
/*      */   public final dyi f;
/*      */   private final enb V;
/*      */   private final dkm W;
/*      */   public final dku g;
/*      */   public final dzz h;
/*      */   public final edh i;
/*      */   private final AtomicReference<aat> X;
/*      */   public final dkv j;
/*      */   public final dkd k;
/*      */   private final djv Y;
/*      */   public final dka l;
/*      */   public final djx m;
/*      */   public final File n;
/*      */   private final String Z;
/*      */   private final String aa;
/*      */   private final Proxy ab;
/*      */   private final cyg ac;
/*      */   public final afc o;
/*      */   private final boolean ad;
/*      */   private final boolean ae;
/*      */   private final boolean af;
/*      */   private final boolean ag;
/*      */   private final acf ah;
/*      */   private final ekh ai;
/*      */   private final abw aj;
/*      */   private final ekz ak;
/*      */   private final dko al;
/*      */   private final dks am;
/*      */   private final deg an;
/*      */   private final enu ao;
/*      */   private final enp ap;
/*      */   private final dmv aq;
/*      */   private final ekt ar;
/*      */   private final eaa as;
/*      */   private final MinecraftSessionService at;
/*      */   private final SocialInteractionsService au;
/*      */   private final eks av;
/*      */   private final elt aw;
/*      */   private final eax ax;
/*      */   private final ekr ay;
/*      */   private final ekp az;
/*      */   private final dmr aA;
/*      */   private final djs aB;
/*      */   private final eoe aC;
/*      */   private final dsa aD;
/*  327 */   public static byte[] p = new byte[10485760];
/*      */   
/*      */   @Nullable
/*      */   public dww q;
/*      */   
/*      */   @Nullable
/*      */   public dwt r;
/*      */   
/*      */   @Nullable
/*      */   public dzm s;
/*      */   
/*      */   @Nullable
/*      */   private eng aE;
/*      */   
/*      */   @Nullable
/*      */   private dwz aF;
/*      */   
/*      */   @Nullable
/*      */   private nd aG;
/*      */   
/*      */   private boolean aH;
/*      */   
/*      */   @Nullable
/*      */   public aqa t;
/*      */   
/*      */   @Nullable
/*      */   public aqa u;
/*      */   
/*      */   @Nullable
/*      */   public dcl v;
/*      */   
/*      */   private int aI;
/*      */   
/*      */   protected int w;
/*      */   private boolean aJ;
/*      */   private float aK;
/*      */   private long aL;
/*      */   private long aM;
/*      */   private int aN;
/*      */   public boolean x;
/*      */   @Nullable
/*      */   public dot y;
/*      */   @Nullable
/*      */   public don z;
/*      */   private boolean aO;
/*      */   private Thread aP;
/*      */   private volatile boolean aQ;
/*      */   @Nullable
/*      */   private l aR;
/*      */   private static int aS;
/*      */   public String A;
/*      */   public boolean C;
/*      */   public boolean D;
/*      */   public boolean E;
/*      */   private boolean aT;
/*      */   private final Queue<Runnable> aU;
/*      */   @Nullable
/*      */   private CompletableFuture<Void> aV;
/*      */   @Nullable
/*      */   private dms aW;
/*      */   private anw aX;
/*      */   private int aY;
/*      */   private final anq aZ;
/*      */   @Nullable
/*      */   private anv ba;
/*      */   private String bb;
/*      */   
/*      */   public djz(dsz ☃) {
/*  395 */     super("Client");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     String str;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int i;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     dej dej;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.P = new dkk(20.0F, 0L);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.Q = new apc("client", this, x.b());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.V = new enb();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.X = new AtomicReference<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.o = new afc();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.aB = new djs(this);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.aL = x.c();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.aQ = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.A = "";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.E = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.aU = Queues.newConcurrentLinkedQueue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.aX = ant.a;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.aZ = new anq(x.a, () -> this.aY);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1190 */     this.bb = "root"; F = this; this.n = ☃.c.a; File file = ☃.c.c; this.J = ☃.c.b; this.Z = ☃.d.b; this.aa = ☃.d.c; this.K = ☃.a.c; this.ai = new ekh(new File(this.n, "server-resource-packs"), ☃.c.a()); this.aj = new abw(djz::a, new aby[] { this.ai, new abt(this.J, abx.a) }); this.ab = ☃.a.d; YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(this.ab); this.at = yggdrasilAuthenticationService.createMinecraftSessionService(); this.au = a(yggdrasilAuthenticationService, ☃); this.W = ☃.a.a; G.info("Setting user: {}", this.W.c()); G.debug("(Session ID is {})", this.W.a()); this.ae = ☃.d.a; this.af = !☃.d.d; this.ag = !☃.d.e; this.ad = aH(); this.aE = null; if (s() && ☃.e.a != null) { str = ☃.e.a; i = ☃.e.b; } else { str = null; i = 0; }  nw.a(djw::a); this.M = agb.a(); this.aA = new dmr(this); this.aC = new eoe(this); this.aP = Thread.currentThread(); this.k = new dkd(this, this.n); this.Y = new djv(this.n, this.M); G.info("Backend library: {}", RenderSystem.getBackendDescription()); if (this.k.t > 0 && this.k.s > 0) { dej = new dej(this.k.s, this.k.t, ☃.b.c, ☃.b.d, ☃.b.e); } else { dej = ☃.b; }  x.a = RenderSystem.initBackendSystem(); this.N = new eau(this); this.O = this.N.a(dej, this.k.n, aF()); a(true); try { InputStream inputStream1 = P().a().a(abk.a, new vk("icons/icon_16x16.png")); InputStream inputStream2 = P().a().a(abk.a, new vk("icons/icon_32x32.png")); this.O.a(inputStream1, inputStream2); } catch (IOException iOException) { G.error("Couldn't set icon", iOException); }  this.O.a(this.k.d); this.l = new dka(this); this.l.a(this.O.i()); this.m = new djx(this); this.m.a(this.O.i()); RenderSystem.initRenderer(this.k.I, false); this.an = new deg(this.O.k(), this.O.l(), true, a); this.an.a(0.0F, 0.0F, 0.0F, 0.0F); this.ah = new acm(abk.a); this.aj.a(); this.k.a(this.aj); this.ak = new ekz(this.k.aV); this.ah.a(this.ak); this.L = new ekd(this.ah); this.ah.a(this.L); this.av = new eks(this.L, new File(file, "skins"), this.at); this.ac = new cyg(this.n.toPath().resolve("saves"), this.n.toPath().resolve("backups"), this.M); this.ao = new enu(this.ah, this.k); this.ah.a(this.ao); this.ar = new ekt(this.W); this.ah.a(this.ar); this.ap = new enp(this); this.aq = new dmv(this.L); this.g = this.aq.a(); this.ah.a(this.aq.b()); b(i()); this.ah.a(new ekm()); this.ah.a(new ekl()); this.O.a("Startup"); RenderSystem.setupDefaultState(0, 0, this.O.k(), this.O.l()); this.O.a("Post startup"); this.al = dko.a(); this.am = dks.a(this.al); this.aw = new elt(this.L, this.al, this.k.A); this.ah.a(this.aw); this.T = new efo(this.L, this.aw, this.am); this.S = new eet(this.L, this.T, this.ah, this.g, this.k); this.U = new eac(this); this.ah.a(this.T); this.R = new eam(); this.h = new dzz(this, this.ah, this.R); this.ah.a(this.h); this.aD = new dsa(this, this.au); this.ax = new eax(this.aw.b(), this.al); this.ah.a(this.ax); this.e = new eae(this, this.R); this.ah.a(this.e); aG(); this.ah.a(this.V); this.f = new dyi(this.r, this.L); this.ah.a(this.f); this.ay = new ekr(this.L); this.ah.a(this.ay); this.az = new ekp(this.L); this.ah.a(this.az); this.as = new eaa(); this.ah.a(this.as); this.j = new dkv(this); this.i = new edh(this); RenderSystem.setErrorCallback(this::a); if (this.k.Z && !this.O.j()) { this.O.h(); this.k.Z = this.O.j(); }  this.O.a(this.k.O); this.O.b(this.k.H); this.O.c(); a(); if (str != null) { a(new dnt(new doy(), this, str, i)); } else { a(new doy(true)); }  doh.a(this); List<abj> list = this.aj.f(); a(new doh(this, this.ah.a(x.f(), this, H, list), ☃ -> x.a(☃, this::a, ()), false));
/*      */   }
/*      */   public void c() { this.O.b(aF()); }
/* 1193 */   private String aF() { StringBuilder ☃ = new StringBuilder("Minecraft"); if (d()) ☃.append("*");  ☃.append(" "); ☃.append(w.a().getName()); dwu dwu = w(); if (dwu != null && dwu.a().h()) { ☃.append(" - "); if (this.aE != null && !this.aE.n()) { ☃.append(ekx.a("title.singleplayer", new Object[0])); } else if (ah()) { ☃.append(ekx.a("title.multiplayer.realms", new Object[0])); } else if (this.aE != null || (this.aF != null && this.aF.d())) { ☃.append(ekx.a("title.multiplayer.lan", new Object[0])); } else { ☃.append(ekx.a("title.multiplayer.other", new Object[0])); }  }  return ☃.toString(); } private SocialInteractionsService a(YggdrasilAuthenticationService ☃, dsz dsz1) { try { return (SocialInteractionsService)☃.createSocialInteractionsService(dsz1.a.a.d()); } catch (AuthenticationException authenticationException) { G.error("Failed to verify authentication", (Throwable)authenticationException); return (SocialInteractionsService)new OfflineSocialInteractions(); }  } public boolean d() { return (!"vanilla".equals(ClientBrandRetriever.getClientModName()) || djz.class.getSigners() == null); } private void a(Throwable ☃) { if (this.aj.d().size() > 1) { nr nr1; if (☃ instanceof acm.b) { nr1 = new oe(((acm.b)☃).a().a()); } else { nr1 = null; }  a(☃, nr1); } else { x.b(☃); }  } public void a(Throwable ☃, @Nullable nr nr1) { G.info("Caught error loading resourcepacks, removing all selected resourcepacks", ☃); this.aj.a(Collections.emptyList()); this.k.h.clear(); this.k.i.clear(); this.k.b(); j().thenRun(() -> { dmr dmr1 = an(); dmp.b(dmr1, dmp.a.e, new of("resourcePack.load_fail"), ☃); }); } public void e() { this.aP = Thread.currentThread(); try { boolean ☃ = false; while (this.aQ) { if (this.aR != null) { b(this.aR); return; }  try { anz anz = anz.a("Renderer"); boolean bool = aJ(); a(bool, anz); this.aX.a(); e(!☃); this.aX.b(); b(bool, anz); } catch (OutOfMemoryError outOfMemoryError) { if (☃) throw outOfMemoryError;  m(); a(new dom()); System.gc(); G.fatal("Out of memory", outOfMemoryError); ☃ = true; }  }  } catch (u ☃) { c(☃.a()); m(); G.fatal("Reported exception thrown!", ☃); b(☃.a()); } catch (Throwable ☃) { l l1 = c(new l("Unexpected error", ☃)); G.fatal("Unreported exception thrown!", ☃); m(); b(l1); }  } void b(boolean ☃) { this.aq.a(☃ ? (Map<vk, vk>)ImmutableMap.of(b, c) : (Map<vk, vk>)ImmutableMap.of()); } private void aG() { ena<bmb> ☃ = new ena<>(☃ -> ☃.a((bfw)null, bnl.a.a).stream().map(()).filter(()), ☃ -> Stream.of(gm.T.b(☃.b()))); emz<bmb> emz = new emz<>(☃ -> aeg.a().a(☃.b()).stream()); gj<bmb> gj = gj.a(); for (blx blx : gm.T) blx.a(bks.g, gj);  gj.forEach(bmb1 -> { ☃.a(bmb1); emz1.a(bmb1); }); ena<drt> ena = new ena<>(☃ -> ☃.d().stream().flatMap(()).map(()).filter(()), ☃ -> ☃.d().stream().map(())); this.V.a(enb.a, ☃); this.V.a(enb.b, emz); this.V.a(enb.c, ena); } private void a(int ☃, long l1) { this.k.O = false; this.k.b(); } private static boolean aH() { String[] ☃ = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" }; for (String str1 : ☃) { String str2 = System.getProperty(str1); if (str2 != null && str2.contains("64")) return true;  }  return false; } public deg f() { return this.an; } public String g() { return this.Z; } public String h() { return this.aa; } public void a(l ☃) { this.aR = ☃; } public static void b(l ☃) { File file1 = new File((C()).n, "crash-reports"); File file2 = new File(file1, "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-client.txt"); vm.a(☃.e()); if (☃.f() != null) { vm.a("#@!@# Game crashed! Crash report saved to: #@!@# " + ☃.f()); System.exit(-1); } else if (☃.a(file2)) { vm.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath()); System.exit(-1); } else { vm.a("#@?@# Game crashed! Crash report could not be saved. #@?@#"); System.exit(-2); }  } void a(int ☃) { if (this.ba == null) {
/*      */       return;
/*      */     }
/* 1196 */     List<any> list = this.ba.a(this.bb);
/* 1197 */     if (list.isEmpty()) {
/*      */       return;
/*      */     }
/*      */     
/* 1201 */     any any = list.remove(0);
/* 1202 */     if (☃ == 0)
/* 1203 */     { if (!any.d.isEmpty()) {
/* 1204 */         int i = this.bb.lastIndexOf('\036');
/* 1205 */         if (i >= 0) {
/* 1206 */           this.bb = this.bb.substring(0, i);
/*      */         }
/*      */       }  }
/*      */     else
/* 1210 */     { ☃--;
/* 1211 */       if (☃ < list.size() && !"unspecified".equals(((any)list.get(☃)).d))
/* 1212 */       { if (!this.bb.isEmpty()) {
/* 1213 */           this.bb += '\036';
/*      */         }
/* 1215 */         this.bb += ((any)list.get(☃)).d; }  }  }
/*      */   public boolean i() { return this.k.Q; }
/*      */   public CompletableFuture<Void> j() { if (this.aV != null) return this.aV;  CompletableFuture<Void> ☃ = new CompletableFuture<>(); if (this.z instanceof doh) { this.aV = ☃; return ☃; }  this.aj.a(); List<abj> list = this.aj.f(); a(new doh(this, this.ah.a(x.f(), this, H, list), optional -> x.a(optional, this::a, ()), true)); return ☃; }
/*      */   private void aI() { boolean ☃ = false; eaw eaw = ab().a(); elo elo = eaw.a().a(); for (buo buo : gm.Q) { for (UnmodifiableIterator<ceh> unmodifiableIterator = buo.m().a().iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh = unmodifiableIterator.next(); if (ceh.h() == bzh.c) { elo elo1 = eaw.b(ceh); if (elo1 == elo) { G.debug("Missing model for: {}", ceh); ☃ = true; }  }  }  }  ekc ekc = elo.e(); for (buo buo : gm.Q) { for (UnmodifiableIterator<ceh> unmodifiableIterator = buo.m().a().iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh = unmodifiableIterator.next(); ekc ekc1 = eaw.a(ceh); if (!ceh.g() && ekc1 == ekc) { G.debug("Missing particle icon for: {}", ceh); ☃ = true; }  }  }  gj<bmb> gj = gj.a(); for (blx blx : gm.T) { gj.clear(); blx.a(bks.g, gj); for (bmb bmb : gj) { String str1 = bmb.j(); String str2 = (new of(str1)).getString(); if (str2.toLowerCase(Locale.ROOT).equals(blx.a())) G.debug("Missing translation for: {} {} {}", bmb, str1, bmb.b());  }  }  ☃ |= doi.a(); if (☃) throw new IllegalStateException("Your game data is foobar, fix the errors above!");  }
/*      */   public cyg k() { return this.ac; }
/*      */   private void b(String ☃) { if (!F() && !u()) { if (this.s != null) this.s.a((new of("chat.cannotSend")).a(k.m), x.b);  } else { a(new dnq(☃)); }  }
/* 1221 */   public void a(@Nullable dot ☃) { if (this.y != null) this.y.e();  if (☃ == null && this.r == null) { ☃ = new doy(); } else if (☃ == null && this.s.dl()) { if (this.s.G()) { ☃ = new dnx(null, this.r.w().n()); } else { this.s.ey(); }  }  if (☃ instanceof doy || ☃ instanceof drc) { this.k.aJ = false; this.j.c().a(true); }  this.y = ☃; if (☃ != null) { this.l.j(); djw.b(); ☃.b(this, this.O.o(), this.O.p()); this.x = false; dkz.b.a(☃.ax_()); } else { this.ao.f(); this.l.i(); }  c(); } public void a(@Nullable don ☃) { this.z = ☃; } public void l() { try { G.info("Stopping!"); try { dkz.b.c(); } catch (Throwable throwable) {} try { if (this.r != null) this.r.S();  r(); } catch (Throwable throwable) {} if (this.y != null) this.y.e();  close(); } finally { x.a = System::nanoTime; if (this.aR == null) System.exit(0);  }  } public void close() { try { this.aw.close(); this.aq.close(); this.h.close(); this.e.close(); this.ao.e(); this.aj.close(); this.f.a(); this.az.close(); this.ay.close(); this.L.close(); this.ah.close(); x.h(); } catch (Throwable ☃) { G.error("Shutdown failure!", ☃); throw ☃; } finally { this.N.close(); this.O.close(); }  } private void e(boolean ☃) { this.O.a("Pre render"); long l1 = x.c(); if (this.O.b()) n();  if (this.aV != null && !(this.z instanceof doh)) { CompletableFuture<Void> completableFuture = this.aV; this.aV = null; j().thenRun(() -> ☃.complete(null)); }  Runnable runnable; while ((runnable = this.aU.poll()) != null) runnable.run();  if (☃) { int j = this.P.a(x.b()); this.aX.a("scheduledExecutables"); bl(); this.aX.c(); this.aX.a("tick"); for (int k = 0; k < Math.min(10, j); k++) { this.aX.c("clientTick"); q(); }  this.aX.c(); }  this.l.a(); this.O.a("Render"); this.aX.a("sound"); this.ao.a(this.h.k()); this.aX.c(); this.aX.a("render"); RenderSystem.pushMatrix(); RenderSystem.clear(16640, a); this.an.a(true); dzy.a(); this.aX.a("display"); RenderSystem.enableTexture(); RenderSystem.enableCull(); this.aX.c(); if (!this.x) { this.aX.b("gameRenderer"); this.h.a(this.aJ ? this.aK : this.P.a, l1, ☃); this.aX.b("toasts"); this.aA.a(new dfm()); this.aX.c(); }  if (this.ba != null) { this.aX.a("fpsPie"); a(new dfm(), this.ba); this.aX.c(); }  this.aX.a("blit"); this.an.e(); RenderSystem.popMatrix(); RenderSystem.pushMatrix(); this.an.a(this.O.k(), this.O.l()); RenderSystem.popMatrix(); this.aX.b("updateDisplay"); this.O.e(); int i = aK(); if (i < dkc.l.d()) RenderSystem.limitDisplayFPS(i);  this.aX.b("yield"); Thread.yield(); this.aX.c(); this.O.a("Post render"); this.aN++; boolean bool = (G() && ((this.y != null && this.y.ay_()) || (this.z != null && this.z.a())) && !this.aE.n()); if (this.aJ != bool) { if (this.aJ) { this.aK = this.P.a; } else { this.P.a = this.aK; }  this.aJ = bool; }  long l2 = x.c(); this.o.a(l2 - this.aL); this.aL = l2; this.aX.a("fpsUpdate"); while (x.b() >= this.aM + 1000L) { aS = this.aN; this.A = String.format("%d fps T: %s%s%s%s B: %d", new Object[] { Integer.valueOf(aS), (this.k.d == dkc.l.d()) ? "inf" : Integer.valueOf(this.k.d), this.k.O ? " vsync" : "", this.k.f.toString(), (this.k.e == djn.a) ? "" : ((this.k.e == djn.b) ? " fast-clouds" : " fancy-clouds"), Integer.valueOf(this.k.F) }); this.aM += 1000L; this.aN = 0; this.Q.b(); if (!this.Q.d()) this.Q.a();  }  this.aX.c(); } private boolean aJ() { return (this.k.aJ && this.k.aK && !this.k.aI); } private void a(boolean ☃, @Nullable anz anz1) { if (☃) { if (!this.aZ.a()) { this.aY = 0; this.aZ.c(); }  this.aY++; } else { this.aZ.b(); }  this.aX = anz.a(this.aZ.d(), anz1); } private void b(boolean ☃, @Nullable anz anz1) { if (anz1 != null) anz1.b();  if (☃) { this.ba = this.aZ.e(); } else { this.ba = null; }  this.aX = this.aZ.d(); } public void a() { int ☃ = this.O.a(this.k.aS, i()); this.O.a(☃); if (this.y != null) this.y.a(this, this.O.o(), this.O.p());  deg deg1 = f(); deg1.a(this.O.k(), this.O.l(), a); this.h.a(this.O.k(), this.O.l()); this.l.g(); } public void b() { this.l.k(); } private int aK() { if (this.r == null && (this.y != null || this.z != null)) return 60;  return this.O.d(); } public void m() { try { p = new byte[0]; this.e.m(); } catch (Throwable throwable) {} try { System.gc(); if (this.aH && this.aE != null) this.aE.a(true);  b(new dod(new of("menu.savingLevel"))); } catch (Throwable throwable) {} System.gc(); } private void a(dfm ☃, anv anv1) { List<any> list = anv1.a(this.bb);
/* 1222 */     any any = list.remove(0);
/*      */     
/* 1224 */     RenderSystem.clear(256, a);
/* 1225 */     RenderSystem.matrixMode(5889);
/* 1226 */     RenderSystem.loadIdentity();
/* 1227 */     RenderSystem.ortho(0.0D, this.O.k(), this.O.l(), 0.0D, 1000.0D, 3000.0D);
/* 1228 */     RenderSystem.matrixMode(5888);
/* 1229 */     RenderSystem.loadIdentity();
/* 1230 */     RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
/*      */     
/* 1232 */     RenderSystem.lineWidth(1.0F);
/* 1233 */     RenderSystem.disableTexture();
/* 1234 */     dfo dfo = dfo.a();
/* 1235 */     dfh dfh = dfo.c();
/*      */     
/* 1237 */     int i = 160;
/* 1238 */     int j = this.O.k() - 160 - 10;
/* 1239 */     int k = this.O.l() - 320;
/* 1240 */     RenderSystem.enableBlend();
/* 1241 */     dfh.a(7, dfk.l);
/* 1242 */     dfh.a((j - 176.0F), (k - 96.0F - 16.0F), 0.0D).a(200, 0, 0, 0).d();
/* 1243 */     dfh.a((j - 176.0F), (k + 320), 0.0D).a(200, 0, 0, 0).d();
/* 1244 */     dfh.a((j + 176.0F), (k + 320), 0.0D).a(200, 0, 0, 0).d();
/* 1245 */     dfh.a((j + 176.0F), (k - 96.0F - 16.0F), 0.0D).a(200, 0, 0, 0).d();
/* 1246 */     dfo.b();
/* 1247 */     RenderSystem.disableBlend();
/*      */     
/* 1249 */     double d = 0.0D;
/* 1250 */     for (any any1 : list) {
/* 1251 */       int i1 = afm.c(any1.a / 4.0D) + 1;
/*      */       
/* 1253 */       dfh.a(6, dfk.l);
/* 1254 */       int i2 = any1.a();
/* 1255 */       int i3 = i2 >> 16 & 0xFF;
/* 1256 */       int i4 = i2 >> 8 & 0xFF;
/* 1257 */       int i5 = i2 & 0xFF;
/* 1258 */       dfh.a(j, k, 0.0D).a(i3, i4, i5, 255).d(); int i6;
/* 1259 */       for (i6 = i1; i6 >= 0; i6--) {
/* 1260 */         float f1 = (float)((d + any1.a * i6 / i1) * 6.2831854820251465D / 100.0D);
/* 1261 */         float f2 = afm.a(f1) * 160.0F;
/* 1262 */         float f3 = afm.b(f1) * 160.0F * 0.5F;
/* 1263 */         dfh.a((j + f2), (k - f3), 0.0D).a(i3, i4, i5, 255).d();
/*      */       } 
/* 1265 */       dfo.b();
/*      */       
/* 1267 */       dfh.a(5, dfk.l);
/* 1268 */       for (i6 = i1; i6 >= 0; i6--) {
/* 1269 */         float f1 = (float)((d + any1.a * i6 / i1) * 6.2831854820251465D / 100.0D);
/* 1270 */         float f2 = afm.a(f1) * 160.0F;
/* 1271 */         float f3 = afm.b(f1) * 160.0F * 0.5F;
/* 1272 */         if (f3 <= 0.0F) {
/*      */ 
/*      */           
/* 1275 */           dfh.a((j + f2), (k - f3), 0.0D).a(i3 >> 1, i4 >> 1, i5 >> 1, 255).d();
/* 1276 */           dfh.a((j + f2), (k - f3 + 10.0F), 0.0D).a(i3 >> 1, i4 >> 1, i5 >> 1, 255).d();
/*      */         } 
/* 1278 */       }  dfo.b();
/*      */       
/* 1280 */       d += any1.a;
/*      */     } 
/* 1282 */     DecimalFormat decimalFormat = new DecimalFormat("##0.00");
/* 1283 */     decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
/*      */     
/* 1285 */     RenderSystem.enableTexture();
/*      */ 
/*      */     
/* 1288 */     String str1 = anv.b(any.d);
/* 1289 */     String str2 = "";
/* 1290 */     if (!"unspecified".equals(str1)) {
/* 1291 */       str2 = str2 + "[0] ";
/*      */     }
/* 1293 */     if (str1.isEmpty()) {
/* 1294 */       str2 = str2 + "ROOT ";
/*      */     } else {
/* 1296 */       str2 = str2 + str1 + ' ';
/*      */     } 
/* 1298 */     int n = 16777215;
/* 1299 */     this.g.a(☃, str2, (j - 160), (k - 80 - 16), 16777215);
/*      */     
/* 1301 */     str2 = decimalFormat.format(any.b) + "%";
/* 1302 */     this.g.a(☃, str2, (j + 160 - this.g.b(str2)), (k - 80 - 16), 16777215);
/*      */ 
/*      */     
/* 1305 */     for (int m = 0; m < list.size(); m++) {
/* 1306 */       any any1 = list.get(m);
/* 1307 */       StringBuilder stringBuilder = new StringBuilder();
/* 1308 */       if ("unspecified".equals(any1.d)) {
/* 1309 */         stringBuilder.append("[?] ");
/*      */       } else {
/* 1311 */         stringBuilder.append("[").append(m + 1).append("] ");
/*      */       } 
/*      */       
/* 1314 */       String str = stringBuilder.append(any1.d).toString();
/* 1315 */       this.g.a(☃, str, (j - 160), (k + 80 + m * 8 + 20), any1.a());
/* 1316 */       str = decimalFormat.format(any1.a) + "%";
/* 1317 */       this.g.a(☃, str, (j + 160 - 50 - this.g.b(str)), (k + 80 + m * 8 + 20), any1.a());
/* 1318 */       str = decimalFormat.format(any1.b) + "%";
/* 1319 */       this.g.a(☃, str, (j + 160 - this.g.b(str)), (k + 80 + m * 8 + 20), any1.a());
/*      */     }  }
/*      */ 
/*      */   
/*      */   public void n() {
/* 1324 */     this.aQ = false;
/*      */   }
/*      */   
/*      */   public boolean o() {
/* 1328 */     return this.aQ;
/*      */   }
/*      */   
/*      */   public void c(boolean ☃) {
/* 1332 */     if (this.y != null) {
/*      */       return;
/*      */     }
/*      */     
/* 1336 */     boolean bool = (G() && !this.aE.n());
/* 1337 */     if (bool) {
/* 1338 */       a(new doo(!☃));
/* 1339 */       this.ao.b();
/*      */     } else {
/* 1341 */       a(new doo(true));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void f(boolean ☃) {
/* 1346 */     if (!☃) {
/* 1347 */       this.w = 0;
/*      */     }
/* 1349 */     if (this.w > 0 || this.s.dW()) {
/*      */       return;
/*      */     }
/*      */     
/* 1353 */     if (☃ && this.v != null && this.v.c() == dcl.a.b) {
/* 1354 */       dcj dcj = (dcj)this.v;
/* 1355 */       fx fx = dcj.a();
/*      */       
/* 1357 */       if (!this.r.d_(fx).g()) {
/* 1358 */         gc gc = dcj.b();
/* 1359 */         if (this.q.b(fx, gc)) {
/* 1360 */           this.f.a(fx, gc);
/* 1361 */           this.s.a(aot.a);
/*      */         } 
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/* 1367 */     this.q.b();
/*      */   } private void aL() {
/*      */     dcj ☃;
/*      */     fx fx;
/* 1371 */     if (this.w > 0) {
/*      */       return;
/*      */     }
/*      */     
/* 1375 */     if (this.v == null) {
/* 1376 */       G.error("Null returned as 'hitResult', this shouldn't happen!");
/* 1377 */       if (this.q.f()) {
/* 1378 */         this.w = 10;
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/* 1383 */     if (this.s.L()) {
/*      */       return;
/*      */     }
/*      */     
/* 1387 */     switch (null.a[this.v.c().ordinal()]) {
/*      */       case 1:
/* 1389 */         this.q.a(this.s, ((dck)this.v).a());
/*      */         break;
/*      */       case 2:
/* 1392 */         ☃ = (dcj)this.v;
/* 1393 */         fx = ☃.a();
/*      */         
/* 1395 */         if (!this.r.d_(fx).g()) {
/* 1396 */           this.q.a(fx, ☃.b());
/*      */           break;
/*      */         } 
/*      */       
/*      */       case 3:
/* 1401 */         if (this.q.f()) {
/* 1402 */           this.w = 10;
/*      */         }
/* 1404 */         this.s.eS();
/*      */         break;
/*      */     } 
/*      */ 
/*      */     
/* 1409 */     this.s.a(aot.a);
/*      */   }
/*      */   
/*      */   private void aM() {
/* 1413 */     if (this.q.m()) {
/*      */       return;
/*      */     }
/*      */     
/* 1417 */     this.aI = 4;
/*      */     
/* 1419 */     if (this.s.L()) {
/*      */       return;
/*      */     }
/*      */     
/* 1423 */     if (this.v == null) {
/* 1424 */       G.warn("Null returned as 'hitResult', this shouldn't happen!");
/*      */     }
/*      */     
/* 1427 */     for (aot ☃ : aot.values()) {
/* 1428 */       bmb bmb = this.s.b(☃);
/*      */       
/* 1430 */       if (this.v != null) {
/* 1431 */         dck dck; aqa aqa1; aou aou1; dcj dcj; int i; aou aou2; switch (null.a[this.v.c().ordinal()]) {
/*      */           case 1:
/* 1433 */             dck = (dck)this.v;
/* 1434 */             aqa1 = dck.a();
/* 1435 */             aou1 = this.q.a(this.s, aqa1, dck, ☃);
/* 1436 */             if (!aou1.a()) {
/* 1437 */               aou1 = this.q.a(this.s, aqa1, ☃);
/*      */             }
/*      */             
/* 1440 */             if (aou1.a()) {
/* 1441 */               if (aou1.b()) {
/* 1442 */                 this.s.a(☃);
/*      */               }
/*      */               return;
/*      */             } 
/*      */             break;
/*      */           
/*      */           case 2:
/* 1449 */             dcj = (dcj)this.v;
/*      */             
/* 1451 */             i = bmb.E();
/* 1452 */             aou2 = this.q.a(this.s, this.r, ☃, dcj);
/* 1453 */             if (aou2.a()) {
/* 1454 */               if (aou2.b()) {
/* 1455 */                 this.s.a(☃);
/*      */ 
/*      */                 
/* 1458 */                 if (!bmb.a() && (bmb.E() != i || this.q.g())) {
/* 1459 */                   this.h.a.a(☃);
/*      */                 }
/*      */               } 
/*      */               return;
/*      */             } 
/* 1464 */             if (aou2 == aou.d) {
/*      */               return;
/*      */             }
/*      */             break;
/*      */         } 
/*      */       
/*      */       } 
/* 1471 */       if (!bmb.a()) {
/* 1472 */         aou aou = this.q.a(this.s, this.r, ☃);
/* 1473 */         if (aou.a()) {
/* 1474 */           if (aou.b()) {
/* 1475 */             this.s.a(☃);
/*      */           }
/*      */           
/* 1478 */           this.h.a.a(☃);
/*      */           return;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public enp p() {
/* 1486 */     return this.ap;
/*      */   }
/*      */   
/*      */   public void q() {
/* 1490 */     if (this.aI > 0) {
/* 1491 */       this.aI--;
/*      */     }
/*      */     
/* 1494 */     this.aX.a("gui");
/* 1495 */     if (!this.aJ) {
/* 1496 */       this.j.b();
/*      */     }
/* 1498 */     this.aX.c();
/* 1499 */     this.h.a(1.0F);
/* 1500 */     this.aC.a(this.r, this.v);
/*      */     
/* 1502 */     this.aX.a("gameMode");
/* 1503 */     if (!this.aJ && this.r != null) {
/* 1504 */       this.q.d();
/*      */     }
/* 1506 */     this.aX.b("textures");
/* 1507 */     if (this.r != null) {
/* 1508 */       this.L.e();
/*      */     }
/*      */     
/* 1511 */     if (this.y == null && this.s != null) {
/* 1512 */       if (this.s.dl() && !(this.y instanceof dnx)) {
/* 1513 */         a((dot)null);
/* 1514 */       } else if (this.s.em() && this.r != null) {
/* 1515 */         a(new doe());
/*      */       } 
/* 1517 */     } else if (this.y != null && this.y instanceof doe && !this.s.em()) {
/* 1518 */       a((dot)null);
/*      */     } 
/*      */     
/* 1521 */     if (this.y != null) {
/* 1522 */       this.w = 10000;
/*      */     }
/*      */     
/* 1525 */     if (this.y != null) {
/* 1526 */       dot.a(() -> this.y.d(), "Ticking screen", this.y.getClass().getCanonicalName());
/*      */     }
/* 1528 */     if (!this.k.aJ) {
/* 1529 */       this.j.j();
/*      */     }
/*      */     
/* 1532 */     if (this.z == null && (this.y == null || this.y.n)) {
/* 1533 */       this.aX.b("Keybindings");
/* 1534 */       aO();
/*      */       
/* 1536 */       if (this.w > 0) {
/* 1537 */         this.w--;
/*      */       }
/*      */     } 
/*      */     
/* 1541 */     if (this.r != null) {
/* 1542 */       this.aX.b("gameRenderer");
/* 1543 */       if (!this.aJ) {
/* 1544 */         this.h.e();
/*      */       }
/* 1546 */       this.aX.b("levelRenderer");
/* 1547 */       if (!this.aJ) {
/* 1548 */         this.e.l();
/*      */       }
/* 1550 */       this.aX.b("level");
/* 1551 */       if (!this.aJ) {
/*      */         
/* 1553 */         if (this.r.s() > 0) {
/* 1554 */           this.r.c(this.r.s() - 1);
/*      */         }
/* 1556 */         this.r.g();
/*      */       } 
/* 1558 */     } else if (this.h.f() != null) {
/* 1559 */       this.h.a();
/*      */     } 
/*      */ 
/*      */     
/* 1563 */     if (!this.aJ) {
/* 1564 */       this.ap.a();
/*      */     }
/* 1566 */     this.ao.a(this.aJ);
/*      */     
/* 1568 */     if (this.r != null) {
/* 1569 */       if (!this.aJ) {
/* 1570 */         if (!this.k.E && aN()) {
/* 1571 */           nr ☃ = new of("tutorial.socialInteractions.title");
/* 1572 */           nr nr1 = new of("tutorial.socialInteractions.description", new Object[] { eoe.a("socialInteractions") });
/* 1573 */           this.aW = new dms(dms.a.f, ☃, nr1, true);
/*      */           
/* 1575 */           this.aC.a(this.aW, 160);
/* 1576 */           this.k.E = true;
/* 1577 */           this.k.b();
/*      */         } 
/*      */         
/* 1580 */         this.aC.d();
/*      */         
/*      */         try {
/* 1583 */           this.r.a(() -> true);
/* 1584 */         } catch (Throwable ☃) {
/* 1585 */           l l1 = l.a(☃, "Exception in world tick");
/* 1586 */           if (this.r == null) {
/* 1587 */             m m = l1.a("Affected level");
/* 1588 */             m.a("Problem", "Level is null!");
/*      */           } else {
/* 1590 */             this.r.a(l1);
/*      */           } 
/* 1592 */           throw new u(l1);
/*      */         } 
/*      */       } 
/* 1595 */       this.aX.b("animateTick");
/* 1596 */       if (!this.aJ && this.r != null) {
/* 1597 */         this.r.c(afm.c(this.s.cD()), afm.c(this.s.cE()), afm.c(this.s.cH()));
/*      */       }
/* 1599 */       this.aX.b("particles");
/* 1600 */       if (!this.aJ) {
/* 1601 */         this.f.b();
/*      */       }
/* 1603 */     } else if (this.aG != null) {
/* 1604 */       this.aX.b("pendingConnection");
/* 1605 */       this.aG.a();
/*      */     } 
/*      */     
/* 1608 */     this.aX.b("keyboard");
/* 1609 */     this.m.b();
/*      */     
/* 1611 */     this.aX.c();
/*      */   }
/*      */   
/*      */   private boolean aN() {
/* 1615 */     return (!this.aH || (this.aE != null && this.aE.n()));
/*      */   }
/*      */   
/*      */   private void aO() {
/* 1619 */     while (this.k.ax.f()) {
/* 1620 */       djl djl = this.k.g();
/* 1621 */       this.k.a(this.k.g().c());
/* 1622 */       if (djl.a() != this.k.g().a()) {
/* 1623 */         this.h.a(this.k.g().a() ? aa() : null);
/*      */       }
/* 1625 */       this.e.o();
/*      */     } 
/*      */     
/* 1628 */     while (this.k.ay.f()) {
/* 1629 */       this.k.aN = !this.k.aN;
/*      */     }
/*      */     
/* 1632 */     for (int i = 0; i < 9; i++) {
/* 1633 */       boolean bool1 = this.k.aD.d();
/* 1634 */       boolean bool2 = this.k.aE.d();
/* 1635 */       if (this.k.aC[i].f()) {
/* 1636 */         if (this.s.a_()) {
/* 1637 */           this.j.f().a(i);
/* 1638 */         } else if (this.s.b_() && this.y == null && (bool2 || bool1)) {
/* 1639 */           dqc.a(this, i, bool2, bool1);
/*      */         } else {
/* 1641 */           this.s.bm.d = i;
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1646 */     while (this.k.av.f()) {
/* 1647 */       if (!aN()) {
/* 1648 */         this.s.a(I, true);
/* 1649 */         dkz.b.a(I.getString()); continue;
/*      */       } 
/* 1651 */       if (this.aW != null) {
/* 1652 */         this.aC.a(this.aW);
/* 1653 */         this.aW = null;
/*      */       } 
/* 1655 */       a(new dsc());
/*      */     } 
/*      */ 
/*      */     
/* 1659 */     while (this.k.am.f()) {
/* 1660 */       if (this.q.i()) {
/* 1661 */         this.s.A(); continue;
/*      */       } 
/* 1663 */       this.aC.a();
/* 1664 */       a(new dql(this.s));
/*      */     } 
/*      */     
/* 1667 */     while (this.k.aB.f()) {
/* 1668 */       a(new dpi(this.s.e.h()));
/*      */     }
/* 1670 */     while (this.k.an.f()) {
/* 1671 */       if (!this.s.a_()) {
/* 1672 */         w().a(new sz(sz.a.g, fx.b, gc.a));
/*      */       }
/*      */     } 
/* 1675 */     while (this.k.ao.f()) {
/* 1676 */       if (!this.s.a_() && 
/* 1677 */         this.s.a(dot.x())) {
/* 1678 */         this.s.a(aot.a);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1683 */     boolean ☃ = (this.k.j != bfu.c);
/* 1684 */     if (☃) {
/* 1685 */       while (this.k.as.f()) {
/* 1686 */         b("");
/*      */       }
/* 1688 */       if (this.y == null && this.z == null && this.k.au.f()) {
/* 1689 */         b("/");
/*      */       }
/*      */     } 
/*      */     
/* 1693 */     if (this.s.dW()) {
/* 1694 */       if (!this.k.ap.d()) {
/* 1695 */         this.q.b(this.s);
/*      */       }
/*      */       
/* 1698 */       while (this.k.aq.f());
/*      */       
/* 1700 */       while (this.k.ap.f());
/*      */       
/* 1702 */       while (this.k.ar.f());
/*      */     } else {
/*      */       
/* 1705 */       while (this.k.aq.f()) {
/* 1706 */         aL();
/*      */       }
/* 1708 */       while (this.k.ap.f()) {
/* 1709 */         aM();
/*      */       }
/* 1711 */       while (this.k.ar.f()) {
/* 1712 */         aP();
/*      */       }
/*      */     } 
/*      */     
/* 1716 */     if (this.k.ap.d() && this.aI == 0 && !this.s.dW()) {
/* 1717 */       aM();
/*      */     }
/*      */     
/* 1720 */     f((this.y == null && this.k.aq.d() && this.l.h()));
/*      */   }
/*      */   
/*      */   public static brk a(cyg.a ☃) {
/* 1724 */     MinecraftServer.a(☃);
/* 1725 */     brk brk = ☃.e();
/* 1726 */     if (brk == null) {
/* 1727 */       throw new IllegalStateException("Failed to load data pack config");
/*      */     }
/* 1729 */     return brk;
/*      */   }
/*      */   
/*      */   public static cyn a(cyg.a ☃, gn.b b1, ach ach1, brk brk1) {
/* 1733 */     vh<mt> vh = vh.a(mo.a, ach1, b1);
/* 1734 */     cyn cyn = ☃.a(vh, brk1);
/* 1735 */     if (cyn == null) {
/* 1736 */       throw new IllegalStateException("Failed to load world");
/*      */     }
/* 1738 */     return cyn;
/*      */   }
/*      */   
/*      */   enum a {
/* 1742 */     a,
/* 1743 */     b,
/* 1744 */     c;
/*      */   }
/*      */   
/*      */   public void a(String ☃) {
/* 1748 */     a(☃, gn.b(), djz::a, djz::a, false, a.c);
/*      */   }
/*      */   
/*      */   public void a(String ☃, bsa bsa1, gn.b b1, chw chw1) {
/* 1752 */     a(☃, b1, a1 -> ☃.g(), (a1, b1, ach1, brk1) -> { vi<JsonElement> vi = vi.a((DynamicOps<JsonElement>)JsonOps.INSTANCE, ☃); vh<JsonElement> vh = vh.a((DynamicOps<JsonElement>)JsonOps.INSTANCE, ach1, ☃); DataResult<chw> dataResult = chw.a.encodeStart(vi, chw1).setLifecycle(Lifecycle.stable()).flatMap(()); chw chw2 = dataResult.resultOrPartial(x.a("Error reading worldgen settings after loading data packs: ", G::error)).orElse(chw1); return new cyl(bsa1, chw2, dataResult.lifecycle()); }false, a.b);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class b
/*      */     implements AutoCloseable
/*      */   {
/*      */     private final abw a;
/*      */ 
/*      */     
/*      */     private final vz b;
/*      */ 
/*      */     
/*      */     private final cyn c;
/*      */ 
/*      */ 
/*      */     
/*      */     private b(abw ☃, vz vz1, cyn cyn1) {
/* 1771 */       this.a = ☃;
/* 1772 */       this.b = vz1;
/* 1773 */       this.c = cyn1;
/*      */     }
/*      */     
/*      */     public abw a() {
/* 1777 */       return this.a;
/*      */     }
/*      */     
/*      */     public vz b() {
/* 1781 */       return this.b;
/*      */     }
/*      */     
/*      */     public cyn c() {
/* 1785 */       return this.c;
/*      */     }
/*      */ 
/*      */     
/*      */     public void close() {
/* 1790 */       this.a.close();
/* 1791 */       this.b.close();
/*      */     } }
/*      */   
/*      */   private void a(String ☃, gn.b b1, Function<cyg.a, brk> function, Function4<cyg.a, gn.b, ach, brk, cyn> function4, boolean bool, a a1) {
/*      */     cyg.a a2;
/*      */     b b2;
/*      */     try {
/* 1798 */       a2 = this.ac.c(☃);
/* 1799 */     } catch (IOException iOException) {
/* 1800 */       G.warn("Failed to read level {} data", ☃, iOException);
/* 1801 */       dmp.a(this, ☃);
/* 1802 */       a((dot)null);
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*      */     try {
/* 1808 */       b2 = a(b1, function, function4, bool, a2);
/* 1809 */     } catch (Exception exception) {
/* 1810 */       G.warn("Failed to load datapacks, can't proceed with server load", exception);
/* 1811 */       a(new dnw(() -> a(☃, b1, function, function4, true, a1)));
/*      */       try {
/* 1813 */         a2.close();
/* 1814 */       } catch (IOException iOException) {
/* 1815 */         G.warn("Failed to unlock access to level {}", ☃, iOException);
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/* 1820 */     cyn cyn = b2.c();
/*      */     
/* 1822 */     boolean bool1 = cyn.A().i();
/* 1823 */     boolean bool2 = (cyn.B() != Lifecycle.stable());
/*      */     
/* 1825 */     if (a1 != a.a && (bool1 || bool2)) {
/* 1826 */       a(a1, ☃, bool1, () -> a(☃, b1, function, function4, bool, a.a));
/*      */       
/* 1828 */       b2.close();
/*      */       try {
/* 1830 */         a2.close();
/* 1831 */       } catch (IOException iOException) {
/* 1832 */         G.warn("Failed to unlock access to level {}", ☃, iOException);
/*      */       } 
/*      */       
/*      */       return;
/*      */     } 
/* 1837 */     r();
/* 1838 */     this.X.set(null);
/*      */     
/*      */     try {
/* 1841 */       a2.a(b1, cyn);
/* 1842 */       b2.b().i();
/*      */       
/* 1844 */       YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(this.ab);
/* 1845 */       MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
/* 1846 */       GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
/* 1847 */       acq acq = new acq(gameProfileRepository, new File(this.n, MinecraftServer.b.getName()));
/*      */       
/* 1849 */       cdg.a(acq);
/* 1850 */       cdg.a(minecraftSessionService);
/* 1851 */       acq.a(false);
/*      */       
/* 1853 */       this.aE = (eng)MinecraftServer.a(thread -> new eng(thread, this, ☃, a1, b1.a(), b1.b(), cyn1, minecraftSessionService, gameProfileRepository, acq1, ()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1859 */       this.aH = true;
/* 1860 */     } catch (Throwable throwable) {
/* 1861 */       l l1 = l.a(throwable, "Starting integrated server");
/* 1862 */       m m = l1.a("Starting integrated server");
/*      */       
/* 1864 */       m.a("Level ID", ☃);
/* 1865 */       m.a("Level Name", cyn.g());
/*      */       
/* 1867 */       throw new u(l1);
/*      */     } 
/*      */     
/* 1870 */     while (this.X.get() == null) {
/* 1871 */       Thread.yield();
/*      */     }
/* 1873 */     dog dog = new dog(this.X.get());
/*      */     
/* 1875 */     a(dog);
/* 1876 */     this.aX.a("waitForServer");
/* 1877 */     while (!this.aE.ag()) {
/* 1878 */       dog.d();
/* 1879 */       e(false);
/*      */       try {
/* 1881 */         Thread.sleep(16L);
/* 1882 */       } catch (InterruptedException interruptedException) {}
/*      */       
/* 1884 */       if (this.aR != null) {
/* 1885 */         b(this.aR);
/*      */         return;
/*      */       } 
/*      */     } 
/* 1889 */     this.aX.c();
/*      */     
/* 1891 */     SocketAddress socketAddress = this.aE.af().a();
/* 1892 */     nd nd1 = nd.a(socketAddress);
/* 1893 */     nd1.a(new dws(nd1, this, null, ☃ -> { 
/* 1894 */           })); nd1.a(new tv(socketAddress.toString(), 0, ne.d));
/* 1895 */     nd1.a(new ug(J().e()));
/* 1896 */     this.aG = nd1;
/*      */   }
/*      */   
/*      */   private void a(a ☃, String str, boolean bool, Runnable runnable) {
/* 1900 */     if (☃ == a.c) {
/*      */       nr nr1, nr2;
/*      */       
/* 1903 */       if (bool) {
/* 1904 */         nr1 = new of("selectWorld.backupQuestion.customized");
/* 1905 */         nr2 = new of("selectWorld.backupWarning.customized");
/*      */       } else {
/* 1907 */         nr1 = new of("selectWorld.backupQuestion.experimental");
/* 1908 */         nr2 = new of("selectWorld.backupWarning.experimental");
/*      */       } 
/*      */       
/* 1911 */       a(new dno(null, (bool1, bool2) -> { if (bool1) dsh.a(this.ac, ☃);  runnable.run(); }nr1, nr2, false));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1924 */       a(new dns(bool -> {
/*      */               if (bool) {
/*      */                 ☃.run();
/*      */               } else {
/*      */                 a((dot)null);
/*      */ 
/*      */                 
/*      */                 try (cyg.a ☃ = this.ac.c(str)) {
/*      */                   a.g();
/* 1933 */                 } catch (IOException iOException) {
/*      */                   dmp.b(this, str);
/*      */                   G.error("Failed to delete world {}", str, iOException);
/*      */                 } 
/*      */               } 
/*      */             }new of("selectWorld.backupQuestion.experimental"), new of("selectWorld.backupWarning.experimental"), nq.g, nq.d));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public b a(gn.b ☃, Function<cyg.a, brk> function, Function4<cyg.a, gn.b, ach, brk, cyn> function4, boolean bool, cyg.a a1) throws InterruptedException, ExecutionException {
/* 1948 */     brk brk = function.apply(a1);
/*      */ 
/*      */ 
/*      */     
/* 1952 */     abw abw1 = new abw(new aby[] { new abz(), new abt(a1.a(cye.g).toFile(), abx.c) });
/*      */     
/*      */     try {
/* 1955 */       brk brk1 = MinecraftServer.a(abw1, brk, bool);
/* 1956 */       CompletableFuture<vz> completableFuture = vz.a(abw1.f(), dc.a.c, 2, x.f(), this);
/*      */       
/* 1958 */       c(completableFuture::isDone);
/* 1959 */       vz vz = completableFuture.get();
/*      */       
/* 1961 */       cyn cyn = (cyn)function4.apply(a1, ☃, vz.h(), brk1);
/* 1962 */       return new b(abw1, vz, cyn);
/* 1963 */     } catch (InterruptedException|ExecutionException exception) {
/* 1964 */       abw1.close();
/* 1965 */       throw exception;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(dwt ☃) {
/* 1970 */     dor dor = new dor();
/* 1971 */     dor.a(new of("connect.joining"));
/* 1972 */     d(dor);
/* 1973 */     this.r = ☃;
/* 1974 */     b(☃);
/*      */     
/* 1976 */     if (!this.aH) {
/* 1977 */       YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(this.ab);
/* 1978 */       MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
/* 1979 */       GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
/* 1980 */       acq acq = new acq(gameProfileRepository, new File(this.n, MinecraftServer.b.getName()));
/*      */       
/* 1982 */       cdg.a(acq);
/* 1983 */       cdg.a(minecraftSessionService);
/* 1984 */       acq.a(false);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void r() {
/* 1989 */     b(new dor());
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(dot ☃) {
/* 1994 */     dwu dwu = w();
/* 1995 */     if (dwu != null) {
/* 1996 */       bk();
/* 1997 */       dwu.c();
/*      */     } 
/*      */     
/* 2000 */     eng eng1 = this.aE;
/* 2001 */     this.aE = null;
/*      */     
/* 2003 */     this.h.g();
/* 2004 */     this.q = null;
/*      */     
/* 2006 */     dkz.b.b();
/* 2007 */     d(☃);
/*      */     
/* 2009 */     if (this.r != null) {
/* 2010 */       if (eng1 != null) {
/* 2011 */         this.aX.a("waitForServer");
/* 2012 */         while (!eng1.D()) {
/* 2013 */           e(false);
/*      */         }
/* 2015 */         this.aX.c();
/*      */       } 
/* 2017 */       this.ai.b();
/* 2018 */       this.j.h();
/* 2019 */       this.aF = null;
/* 2020 */       this.aH = false;
/* 2021 */       this.aB.b();
/*      */     } 
/*      */     
/* 2024 */     this.r = null;
/* 2025 */     b((dwt)null);
/* 2026 */     this.s = null;
/*      */   }
/*      */   
/*      */   private void d(dot ☃) {
/* 2030 */     this.aX.a("forcedTick");
/* 2031 */     this.ao.d();
/*      */     
/* 2033 */     this.t = null;
/* 2034 */     this.aG = null;
/*      */     
/* 2036 */     a(☃);
/* 2037 */     e(false);
/* 2038 */     this.aX.c();
/*      */   }
/*      */   
/*      */   public void c(dot ☃) {
/* 2042 */     this.aX.a("forcedTick");
/* 2043 */     a(☃);
/* 2044 */     e(false);
/* 2045 */     this.aX.c();
/*      */   }
/*      */   
/*      */   private void b(@Nullable dwt ☃) {
/* 2049 */     this.e.a(☃);
/* 2050 */     this.f.a(☃);
/* 2051 */     ecd.a.a(☃);
/* 2052 */     c();
/*      */   }
/*      */   
/*      */   public boolean s() {
/* 2056 */     return (this.af && this.au.serversAllowed());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(UUID ☃) {
/* 2064 */     if (!u()) {
/* 2065 */       return ((this.s == null || !☃.equals(this.s.bS())) && !☃.equals(x.b));
/*      */     }
/* 2067 */     return this.aD.c(☃);
/*      */   }
/*      */   
/*      */   public boolean u() {
/* 2071 */     return (this.ag && this.au.chatAllowed());
/*      */   }
/*      */   
/*      */   public final boolean v() {
/* 2075 */     return this.ae;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public dwu w() {
/* 2080 */     return (this.s == null) ? null : this.s.e;
/*      */   }
/*      */   
/*      */   public static boolean x() {
/* 2084 */     return !F.k.aI;
/*      */   }
/*      */   
/*      */   public static boolean z() {
/* 2088 */     return (F.k.f.a() >= djt.b.a());
/*      */   }
/*      */   
/*      */   public static boolean A() {
/* 2092 */     return (F.k.f.a() >= djt.c.a());
/*      */   }
/*      */   
/*      */   public static boolean B() {
/* 2096 */     return (F.k.g != djh.a);
/*      */   }
/*      */   private void aP() {
/*      */     bmb bmb;
/* 2100 */     if (this.v == null || this.v.c() == dcl.a.a) {
/*      */       return;
/*      */     }
/*      */     
/* 2104 */     boolean ☃ = this.s.bC.d;
/* 2105 */     ccj ccj = null;
/*      */ 
/*      */     
/* 2108 */     dcl.a a = this.v.c();
/* 2109 */     if (a == dcl.a.b) {
/* 2110 */       fx fx = ((dcj)this.v).a();
/*      */       
/* 2112 */       ceh ceh = this.r.d_(fx);
/* 2113 */       buo buo = ceh.b();
/*      */       
/* 2115 */       if (ceh.g()) {
/*      */         return;
/*      */       }
/*      */       
/* 2119 */       bmb = buo.a(this.r, fx, ceh);
/* 2120 */       if (bmb.a()) {
/*      */         return;
/*      */       }
/*      */       
/* 2124 */       if (☃ && dot.x() && buo.q()) {
/* 2125 */         ccj = this.r.c(fx);
/*      */       }
/* 2127 */     } else if (a == dcl.a.c && ☃) {
/* 2128 */       aqa aqa1 = ((dck)this.v).a();
/* 2129 */       if (aqa1 instanceof bcs) {
/* 2130 */         bmb = new bmb(bmd.lz);
/* 2131 */       } else if (aqa1 instanceof bcq) {
/* 2132 */         bmb = new bmb(bmd.pH);
/* 2133 */       } else if (aqa1 instanceof bcp) {
/* 2134 */         bcp bcp = (bcp)aqa1;
/* 2135 */         bmb bmb1 = bcp.o();
/* 2136 */         if (bmb1.a()) {
/* 2137 */           bmb = new bmb(bmd.oW);
/*      */         } else {
/* 2139 */           bmb = bmb1.i();
/*      */         } 
/* 2141 */       } else if (aqa1 instanceof bhl) {
/* 2142 */         blx blx; bhl bhl = (bhl)aqa1;
/*      */ 
/*      */         
/* 2145 */         switch (null.b[bhl.o().ordinal()]) {
/*      */           case 1:
/* 2147 */             blx = bmd.mf;
/*      */             break;
/*      */           case 2:
/* 2150 */             blx = bmd.me;
/*      */             break;
/*      */           case 3:
/* 2153 */             blx = bmd.pt;
/*      */             break;
/*      */           case 4:
/* 2156 */             blx = bmd.pu;
/*      */             break;
/*      */           case 5:
/* 2159 */             blx = bmd.pJ;
/*      */             break;
/*      */           default:
/* 2162 */             blx = bmd.lN;
/*      */             break;
/*      */         } 
/*      */         
/* 2166 */         bmb = new bmb(blx);
/* 2167 */       } else if (aqa1 instanceof bhn) {
/* 2168 */         bmb = new bmb(((bhn)aqa1).g());
/* 2169 */       } else if (aqa1 instanceof bcn) {
/* 2170 */         bmb = new bmb(bmd.pC);
/* 2171 */       } else if (aqa1 instanceof bbq) {
/* 2172 */         bmb = new bmb(bmd.qc);
/*      */       } else {
/* 2174 */         bna bna = bna.a(aqa1.X());
/* 2175 */         if (bna == null) {
/*      */           return;
/*      */         }
/* 2178 */         bmb = new bmb(bna);
/*      */       } 
/*      */     } else {
/*      */       return;
/*      */     } 
/*      */     
/* 2184 */     if (bmb.a()) {
/* 2185 */       String str = "";
/* 2186 */       if (a == dcl.a.b) {
/* 2187 */         str = gm.Q.b(this.r.d_(((dcj)this.v).a()).b()).toString();
/* 2188 */       } else if (a == dcl.a.c) {
/* 2189 */         str = gm.S.b(((dck)this.v).a().X()).toString();
/*      */       } 
/* 2191 */       G.warn("Picking on: [{}] {} gave null item", a, str);
/*      */       
/*      */       return;
/*      */     } 
/* 2195 */     bfv bfv = this.s.bm;
/* 2196 */     if (ccj != null) {
/* 2197 */       a(bmb, ccj);
/*      */     }
/*      */     
/* 2200 */     int i = bfv.b(bmb);
/* 2201 */     if (☃) {
/*      */       
/* 2203 */       bfv.a(bmb);
/*      */       
/* 2205 */       this.q.a(this.s.b(aot.a), 36 + bfv.d);
/* 2206 */     } else if (i != -1) {
/* 2207 */       if (bfv.d(i)) {
/* 2208 */         bfv.d = i;
/*      */       } else {
/* 2210 */         this.q.a(i);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private bmb a(bmb ☃, ccj ccj1) {
/* 2216 */     md md1 = ccj1.a(new md());
/*      */     
/* 2218 */     if (☃.b() instanceof bmm && md1.e("SkullOwner")) {
/* 2219 */       md md = md1.p("SkullOwner");
/* 2220 */       ☃.p().a("SkullOwner", md);
/* 2221 */       return ☃;
/*      */     } 
/*      */     
/* 2224 */     ☃.a("BlockEntityTag", md1);
/* 2225 */     md md2 = new md();
/*      */     
/* 2227 */     mj mj = new mj();
/* 2228 */     mj.add(ms.a("\"(+NBT)\""));
/* 2229 */     md2.a("Lore", mj);
/* 2230 */     ☃.a("display", md2);
/*      */     
/* 2232 */     return ☃;
/*      */   }
/*      */   
/*      */   public l c(l ☃) {
/* 2236 */     a(this.ak, this.Z, this.k, ☃);
/*      */     
/* 2238 */     if (this.r != null) {
/* 2239 */       this.r.a(☃);
/*      */     }
/*      */     
/* 2242 */     return ☃;
/*      */   }
/*      */   
/*      */   public static void a(@Nullable ekz ☃, String str, @Nullable dkd dkd1, l l1) {
/* 2246 */     m m = l1.g();
/* 2247 */     m.a("Launched Version", () -> ☃);
/* 2248 */     m.a("Backend library", RenderSystem::getBackendDescription);
/* 2249 */     m.a("Backend API", RenderSystem::getApiDescription);
/*      */     
/* 2251 */     m.a("GL Caps", RenderSystem::getCapsString);
/* 2252 */     m.a("Using VBOs", () -> "Yes");
/* 2253 */     m.a("Is Modded", () -> {
/*      */           String ☃ = ClientBrandRetriever.getClientModName();
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           return !"vanilla".equals(☃) ? ("Definitely; Client brand changed to '" + ☃ + "'") : ((djz.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.");
/*      */         });
/*      */ 
/*      */ 
/*      */     
/* 2264 */     m.a("Type", "Client (map_client.txt)");
/* 2265 */     if (dkd1 != null) {
/* 2266 */       if (F != null) {
/* 2267 */         String str1 = F.V().m();
/* 2268 */         if (str1 != null) {
/* 2269 */           m.a("GPU Warnings", str1);
/*      */         }
/*      */       } 
/* 2272 */       m.a("Graphics mode", dkd1.f);
/* 2273 */       m.a("Resource Packs", () -> {
/*      */             StringBuilder stringBuilder = new StringBuilder();
/*      */             
/*      */             for (String str : ☃.h) {
/*      */               if (stringBuilder.length() > 0) {
/*      */                 stringBuilder.append(", ");
/*      */               }
/*      */               stringBuilder.append(str);
/*      */               if (☃.i.contains(str)) {
/*      */                 stringBuilder.append(" (incompatible)");
/*      */               }
/*      */             } 
/*      */             return stringBuilder.toString();
/*      */           });
/*      */     } 
/* 2288 */     if (☃ != null) {
/* 2289 */       m.a("Current Language", () -> ☃.b().toString());
/*      */     }
/* 2291 */     m.a("CPU", den::b);
/*      */   }
/*      */   
/*      */   public static djz C() {
/* 2295 */     return F;
/*      */   }
/*      */   
/*      */   public CompletableFuture<Void> D() {
/* 2299 */     return a(this::j).thenCompose(☃ -> ☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(apc ☃) {
/* 2307 */     ☃.a("fps", Integer.valueOf(aS));
/* 2308 */     ☃.a("vsync_enabled", Boolean.valueOf(this.k.O));
/* 2309 */     ☃.a("display_frequency", Integer.valueOf(this.O.a()));
/* 2310 */     ☃.a("display_type", this.O.j() ? "fullscreen" : "windowed");
/* 2311 */     ☃.a("run_time", Long.valueOf((x.b() - ☃.g()) / 60L * 1000L));
/* 2312 */     ☃.a("current_action", aQ());
/* 2313 */     ☃.a("language", (this.k.aV == null) ? "en_us" : this.k.aV);
/*      */     
/* 2315 */     String str = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) ? "little" : "big";
/* 2316 */     ☃.a("endianness", str);
/* 2317 */     ☃.a("subtitles", Boolean.valueOf(this.k.W));
/* 2318 */     ☃.a("touch", this.k.Y ? "touch" : "mouse");
/*      */     
/* 2320 */     int i = 0;
/* 2321 */     for (abu abu : this.aj.e()) {
/* 2322 */       if (!abu.f() && !abu.g()) {
/* 2323 */         ☃.a("resource_pack[" + i++ + "]", abu.e());
/*      */       }
/*      */     } 
/* 2326 */     ☃.a("resource_packs", Integer.valueOf(i));
/*      */     
/* 2328 */     if (this.aE != null) {
/* 2329 */       ☃.a("snooper_partner", this.aE.aj().f());
/*      */     }
/*      */   }
/*      */   
/*      */   private String aQ() {
/* 2334 */     if (this.aE != null) {
/* 2335 */       if (this.aE.n()) {
/* 2336 */         return "hosting_lan";
/*      */       }
/* 2338 */       return "singleplayer";
/*      */     } 
/*      */     
/* 2341 */     if (this.aF != null) {
/* 2342 */       if (this.aF.d()) {
/* 2343 */         return "playing_lan";
/*      */       }
/* 2345 */       return "multiplayer";
/*      */     } 
/*      */     
/* 2348 */     return "out_of_game";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(@Nullable dwz ☃) {
/* 2374 */     this.aF = ☃;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public dwz E() {
/* 2379 */     return this.aF;
/*      */   }
/*      */   
/*      */   public boolean F() {
/* 2383 */     return this.aH;
/*      */   }
/*      */   
/*      */   public boolean G() {
/* 2387 */     return (this.aH && this.aE != null);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public eng H() {
/* 2392 */     return this.aE;
/*      */   }
/*      */   
/*      */   public apc I() {
/* 2396 */     return this.Q;
/*      */   }
/*      */   
/*      */   public dkm J() {
/* 2400 */     return this.W;
/*      */   }
/*      */   
/*      */   public PropertyMap K() {
/* 2404 */     if (this.K.isEmpty()) {
/* 2405 */       GameProfile ☃ = Y().fillProfileProperties(this.W.e(), false);
/* 2406 */       this.K.putAll((Multimap)☃.getProperties());
/*      */     } 
/*      */     
/* 2409 */     return this.K;
/*      */   }
/*      */   
/*      */   public Proxy L() {
/* 2413 */     return this.ab;
/*      */   }
/*      */   
/*      */   public ekd M() {
/* 2417 */     return this.L;
/*      */   }
/*      */   
/*      */   public ach N() {
/* 2421 */     return this.ah;
/*      */   }
/*      */   
/*      */   public abw O() {
/* 2425 */     return this.aj;
/*      */   }
/*      */   
/*      */   public ekh P() {
/* 2429 */     return this.ai;
/*      */   }
/*      */   
/*      */   public File Q() {
/* 2433 */     return this.J;
/*      */   }
/*      */   
/*      */   public ekz R() {
/* 2437 */     return this.ak;
/*      */   }
/*      */   
/*      */   public Function<vk, ekc> a(vk ☃) {
/* 2441 */     return this.aw.a(☃)::a;
/*      */   }
/*      */   
/*      */   public boolean S() {
/* 2445 */     return this.ad;
/*      */   }
/*      */   
/*      */   public boolean T() {
/* 2449 */     return this.aJ;
/*      */   }
/*      */   
/*      */   public eaa V() {
/* 2453 */     return this.as;
/*      */   }
/*      */   
/*      */   public enu W() {
/* 2457 */     return this.ao;
/*      */   }
/*      */   
/*      */   public adn X() {
/* 2461 */     if (this.y instanceof dpa) {
/* 2462 */       return ado.c;
/*      */     }
/* 2464 */     if (this.s != null) {
/* 2465 */       if (this.s.l.Y() == brx.i) {
/* 2466 */         if (this.j.i().c()) {
/* 2467 */           return ado.d;
/*      */         }
/* 2469 */         return ado.e;
/*      */       } 
/*      */ 
/*      */       
/* 2473 */       bsv.b ☃ = this.s.l.v(this.s.cB()).t();
/* 2474 */       if (this.ap.b(ado.f) || (this.s.aI() && (☃ == bsv.b.l || ☃ == bsv.b.n))) {
/* 2475 */         return ado.f;
/*      */       }
/*      */       
/* 2478 */       if (this.s.l.Y() != brx.h && this.s.bC.d && this.s.bC.c) {
/* 2479 */         return ado.b;
/*      */       }
/*      */       
/* 2482 */       return this.r.d().b(this.s.cB()).s().orElse(ado.g);
/*      */     } 
/*      */     
/* 2485 */     return ado.a;
/*      */   }
/*      */   
/*      */   public MinecraftSessionService Y() {
/* 2489 */     return this.at;
/*      */   }
/*      */   
/*      */   public eks Z() {
/* 2493 */     return this.av;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqa aa() {
/* 2498 */     return this.t;
/*      */   }
/*      */   
/*      */   public void a(aqa ☃) {
/* 2502 */     this.t = ☃;
/* 2503 */     this.h.a(☃);
/*      */   }
/*      */   
/*      */   public boolean b(aqa ☃) {
/* 2507 */     return (☃.bE() || (this.s != null && this.s.a_() && this.k.aA.d() && ☃.X() == aqe.bc));
/*      */   }
/*      */ 
/*      */   
/*      */   protected Thread aw() {
/* 2512 */     return this.aP;
/*      */   }
/*      */ 
/*      */   
/*      */   protected Runnable e(Runnable ☃) {
/* 2517 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean d(Runnable ☃) {
/* 2522 */     return true;
/*      */   }
/*      */   
/*      */   public eax ab() {
/* 2526 */     return this.ax;
/*      */   }
/*      */   
/*      */   public eet ac() {
/* 2530 */     return this.S;
/*      */   }
/*      */   
/*      */   public efo ad() {
/* 2534 */     return this.T;
/*      */   }
/*      */   
/*      */   public eac ae() {
/* 2538 */     return this.U;
/*      */   }
/*      */   
/*      */   public <T> emy<T> a(enb.a<T> ☃) {
/* 2542 */     return this.V.a(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public afc ag() {
/* 2550 */     return this.o;
/*      */   }
/*      */   
/*      */   public boolean ah() {
/* 2554 */     return this.aO;
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/* 2558 */     this.aO = ☃;
/*      */   }
/*      */   
/*      */   public DataFixer ai() {
/* 2562 */     return this.M;
/*      */   }
/*      */   
/*      */   public float aj() {
/* 2566 */     return this.P.a;
/*      */   }
/*      */   
/*      */   public float ak() {
/* 2570 */     return this.P.b;
/*      */   }
/*      */   
/*      */   public dko al() {
/* 2574 */     return this.al;
/*      */   }
/*      */   
/*      */   public boolean am() {
/* 2578 */     return ((this.s != null && this.s.eO()) || this.k.U);
/*      */   }
/*      */   
/*      */   public dmr an() {
/* 2582 */     return this.aA;
/*      */   }
/*      */   
/*      */   public eoe ao() {
/* 2586 */     return this.aC;
/*      */   }
/*      */   
/*      */   public boolean ap() {
/* 2590 */     return this.aT;
/*      */   }
/*      */   
/*      */   public djv aq() {
/* 2594 */     return this.Y;
/*      */   }
/*      */   
/*      */   public elt ar() {
/* 2598 */     return this.aw;
/*      */   }
/*      */   
/*      */   public ekr as() {
/* 2602 */     return this.ay;
/*      */   }
/*      */   
/*      */   public ekp at() {
/* 2606 */     return this.az;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(boolean ☃) {
/* 2611 */     this.aT = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public anw au() {
/* 2734 */     return this.aX;
/*      */   }
/*      */   
/*      */   public djs ax() {
/* 2738 */     return this.aB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ekt az() {
/* 2747 */     return this.ar;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public don aA() {
/* 2752 */     return this.z;
/*      */   }
/*      */   
/*      */   public dsa aB() {
/* 2756 */     return this.aD;
/*      */   }
/*      */   
/*      */   public boolean aC() {
/* 2760 */     return false;
/*      */   }
/*      */   
/*      */   public dez aD() {
/* 2764 */     return this.O;
/*      */   }
/*      */   
/*      */   public eam aE() {
/* 2768 */     return this.R;
/*      */   }
/*      */   
/*      */   private static abu a(String ☃, boolean bool, Supplier<abj> supplier, abj abj1, abo abo1, abu.b b1, abx abx1) {
/* 2772 */     int i = abo1.b();
/*      */     
/* 2774 */     Supplier<abj> supplier1 = supplier;
/* 2775 */     if (i <= 3) {
/* 2776 */       supplier1 = b(supplier1);
/*      */     }
/* 2778 */     if (i <= 4) {
/* 2779 */       supplier1 = c(supplier1);
/*      */     }
/*      */     
/* 2782 */     return new abu(☃, bool, supplier1, abj1, abo1, b1, abx1);
/*      */   }
/*      */   
/*      */   private static Supplier<abj> b(Supplier<abj> ☃) {
/* 2786 */     return () -> new ekn(☃.get(), ekn.a);
/*      */   }
/*      */   
/*      */   private static Supplier<abj> c(Supplier<abj> ☃) {
/* 2790 */     return () -> new ekq(☃.get());
/*      */   }
/*      */   
/*      */   public void b(int ☃) {
/* 2794 */     this.aw.a(☃);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */